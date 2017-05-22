package com.baj.ana.mainapp;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MockQuestionFragment extends Fragment implements RadioGroup.OnCheckedChangeListener {

    public static final String ARG_POS = "position";
    public static final int TOTAL_MOCK_SIZE = 29;
    private static String ARG_QUESTION = "question";
    private static String ARG_OPT1 = "opt1";
    private static String ARG_OPT2 = "opt2";
    private static String ARG_OPT3 = "opt3";
    private static String ARG_OPT4 = "opt4";
    private static String ARG_CATEGORY = "category";
    private static String ARG_SUB_CATEGORY = "subcategory";

    //  private static String ARG_EXPLAIN = "explain";
    private static String ARG_ANS = "answer";
    private String question;
    private String op1;
    private String op2;
    private String op3;
    private String op4;
    private String ans;
    private String sub;
    private TextView tvMQues;
    private RadioButton rbOp1;
    private RadioButton rbOp2;
    private RadioButton rbOp3;
    private RadioButton rbOp4;
    //  private TextView tvMExplation;
    // private ScrollView svExplain;
    private RadioGroup radioGroup;
    FragmentPageChangeListener pageChangeListener;
    private TextView tvQuesCount;
    private Button btnNextQues;
    private int pos;

    public MockQuestionFragment() {
    }

    // factory method
    public static MockQuestionFragment newInstance(QuestionModel model, int position) {
        MockQuestionFragment fragment = new MockQuestionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_QUESTION, model.getQuestion());
        args.putString(ARG_OPT1, model.getOptionA());
        args.putString(ARG_OPT2, model.getOptionB());
        args.putString(ARG_OPT3, model.getOptionC());
        args.putString(ARG_OPT4, model.getOptionD());
        args.putString(ARG_ANS, model.getAnswer());
        args.putInt(ARG_POS, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            question = getArguments().getString(ARG_QUESTION);
            op1 = getArguments().getString(ARG_OPT1);
            op2 = getArguments().getString(ARG_OPT2);
            op3 = getArguments().getString(ARG_OPT3);
            op4 = getArguments().getString(ARG_OPT4);
            ans = getArguments().getString(ARG_ANS);
            pos = getArguments().getInt(ARG_POS);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mock_question, container, false);
        tvMQues = (TextView) view.findViewById(R.id.tvMQues);
        tvQuesCount = (TextView) view.findViewById(R.id.tvQuestionNum);
        rbOp1 = (RadioButton) view.findViewById(R.id.rbOp1);
        rbOp2 = (RadioButton) view.findViewById(R.id.rbOp2);
        rbOp3 = (RadioButton) view.findViewById(R.id.rbOp3);
        rbOp4 = (RadioButton) view.findViewById(R.id.rbOp4);
        rbOp4.setChecked(false);
        rbOp3.setChecked(false);
        rbOp2.setChecked(false);
        rbOp1.setChecked(false);
        // tvMExplation = (TextView) view.findViewById(R.id.tvMExplnation);
        //svExplain = (ScrollView) view.findViewById(R.id.svExplain);
        radioGroup = (RadioGroup) view.findViewById(R.id.radioGroup);
        btnNextQues = (Button) view.findViewById(R.id.btnNextQues);
        btnNextQues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pageChangeListener.loadNextPage(pos + 1);
            }
        });

        bindDataOnView();
        radioGroup.setOnCheckedChangeListener(this);
        return view;
    }

    private void bindDataOnView() {
        tvMQues.setText(question);
        rbOp1.setText(op1);
        rbOp2.setText(op2);
        rbOp3.setText(op3);
        rbOp4.setText(op4);
        tvQuesCount.setText(String.format("Question %d", pos + 1));

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        final int next = pos + 1;
        switch (checkedId) {
            case R.id.rbOp1:
                validateAnswer(op1, rbOp1, "a");
                break;
            case R.id.rbOp2:
                validateAnswer(op2, rbOp2, "b");
                break;
            case R.id.rbOp3:
                validateAnswer(op3, rbOp3, "c");
                break;
            case R.id.rbOp4:
                validateAnswer(op4, rbOp4, "d");
                break;
        }
        boolean b = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pageChangeListener.loadNextPage(next);
            }
        }, 500);

    }

    private void validateAnswer(String option, RadioButton rb, String optionNumber) {
        if (optionNumber.equals(ans)) {
            rb.setBackgroundColor(Color.GREEN);
            pageChangeListener.addOnePoints();
        } else {
            rb.setBackgroundColor(Color.RED);
            pageChangeListener.removeOnePoints();
        }
        if (pos == TOTAL_MOCK_SIZE) {
            pageChangeListener.endMockTest();
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            pageChangeListener = (FragmentPageChangeListener) context;
        } catch (Exception e) {

        }
    }


}
