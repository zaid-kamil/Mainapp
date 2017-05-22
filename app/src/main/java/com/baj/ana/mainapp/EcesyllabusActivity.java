package com.baj.ana.mainapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.baj.ana.mainapp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class EcesyllabusActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecesyllabus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
       /* // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });
    }
*/
    /*
     * Preparing the list data
     */
    private void prepareListData() {
        /*
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

       // Adding child data
        listDataHeader.add("GENERAL APTITUDE");
        listDataHeader.add("ENGINEERING MATHEMATICS");
        listDataHeader.add("NETWORKS");
        listDataHeader.add("ELECTRONIC DEVICES");
        listDataHeader.add("ANALOG CIRCUITS");
        listDataHeader.add("DIGITAL CIRCUITS");
        listDataHeader.add("SIGNALS AND SYSTEMS");
        listDataHeader.add("CONTROL SYSTEMS");
        listDataHeader.add("COMMUNICATIONS");
        listDataHeader.add("ELECTROMAGNETICS");
        */


        // Adding child data
        List<String> GENERALAPTITUDE = new ArrayList<String>();
        GENERALAPTITUDE.add("Verbal Ability: English grammar, sentence completion, verbal analogies, word groups, instructions, critical reasoning and verbal deduction.");
        GENERALAPTITUDE.add("Numerical Ability: Numerical computation, numerical estimation, numerical");


        List<String> ENGINEERINGMATHEMATICS = new ArrayList<String>();
        ENGINEERINGMATHEMATICS.add("Linear Algebra: Matrix Algebra, Systems of linear equations, Eigenvalues, Eigenvectors.");
        ENGINEERINGMATHEMATICS.add("Calculus: Mean value theorems, Theorems of integral calculus, Evaluation of definite and improper integrals, Partial Derivatives, Maxima and minima, Multiple integrals, Fourier series, Vector identities, Directional derivatives, Line integral, Surface integral, Volume integral, Stokes’s theorem, Gauss’s theorem, Green’s theorem.");
        ENGINEERINGMATHEMATICS.add("Differential equations: First order equations (linear and nonlinear), Higher order linear differential equations with constant coefficients, Method of variation of parameters, Cauchy’s equation, Euler’s equation, Initial and boundary value problems, Partial Differential Equations, Method of separation of variables.");
        ENGINEERINGMATHEMATICS.add("Complex variables: Analytic functions, Cauchy’s integral theorem, Cauchy’s integral formula, Taylor series, Laurent series, Residue theorem, Solution integrals.");
        ENGINEERINGMATHEMATICS.add("Probability and Statistics: Sampling theorems, Conditional probability, Mean, Median, Mode, Standard Deviation, Random variables, Discrete and Continuous distributions, Poisson distribution, Normal distribution, Binomial distribution, Correlation analysis, Regression analysis.");
        ENGINEERINGMATHEMATICS.add("Numerical Methods: Solutions of nonlinear algebraic equations, Single and Multi‐step methods for differential equations.");
        ENGINEERINGMATHEMATICS.add("Transform Theory: Fourier Transform, Laplace Transform, z‐Transform.");


        List<String> NETWORKS = new ArrayList<String>();
        NETWORKS.add("Network graphs: matrices associated with graphs; incidence, fundamental cut set and fundamental circuit matrices. Solution methods: nodal and mesh analysis. Network theorems: superposition, Thevenin and Norton’s maximum power transfer, Wye-Delta transformation. Steady state sinusoidal analysis using phasors. Linear constant coefficient differential equations; time domain analysis of simple RLC circuits, Solution of network equations using Laplace transform: frequency domain analysis of RLC circuits. 2-port network parameters: driving pointand transfer functions. State equations for networks.");


        List<String> ELECTRONICDEVICES = new ArrayList<String>();
        ELECTRONICDEVICES.add("Energy bands in silicon, intrinsic and extrinsic silicon. Carrier transport in silicon: diffusion current, drift current, mobility, and resistivity. Generation and recombination of carriers. p-n junction diode, Zener diode, tunnel diode, BJT, JFET, MOS capacitor, MOSFET, LED, p-I-n and avalanche photo diode, Basics of LASERs. Device technology: integrated circuits fabrication process, oxidation, diffusion, ion implantation, photolithography, n-tub, p-tub and twin-tub CMOS process.");

        List<String> ANALOGCIRCUITS = new ArrayList<String>();
        ANALOGCIRCUITS.add("Small Signal Equivalent circuits of diodes, BJTs, MOSFETs and analog CMOS. Simple diode circuits, clipping, clamping, rectifier, Biasing and bias stability of transistor and FET amplifiers. Amplifiers: single-and multi-stage, differential and operational, feedback, and power. Frequency response of amplifiers. Simple op-amp circuits. Filters. Sinusoidal oscillators; criterion for oscillation; single-transistor and op-amp configurations. Function generators and wave-shaping circuits, 555 Timers. Power supplies.");

        List<String> DIGITALCIRCUITS = new ArrayList<String>();
        DIGITALCIRCUITS.add("Boolean algebra, minimization of Boolean functions; logic gates; digital IC families (DTL, TTL, ECL, MOS, CMOS). Combinatorial circuits: arithmetic circuits, code converters, multiplexers, decoders, PROMs and PLAs. Sequential circuits: latches and flip-flops, counters and shift-registers. Sample and hold circuits, ADCs, DACs. Semiconductor memories. Microprocessor (8085): architecture, programming, memory and I/O interfacing.");

        List<String> SIGNALSANDSYSTEMS = new ArrayList<String>();
        SIGNALSANDSYSTEMS.add("Definitions and properties of Laplace transform, continuous-time and discrete-time Fourier series, continuous-time and discrete-time Fourier Transform, DFT and FFT, z-transform. Sampling theorem. Linear Time-Invariant (LTI) Systems: definitions and properties; causality, stability, impulse response, convolution, poles and zeros, parallel and cascade structure, frequency response, group delay, phase delay. Signal transmission through LTI systems.");

        List<String> CONTROLSYSTEMS = new ArrayList<String>();
        CONTROLSYSTEMS.add("Basic control system components; block diagrammatic description, reduction of block diagrams. Open loop and closed loop (feedback) systems and stability analysis of these systems. Signal flow graphs and their use in determining transfer functions of systems; transient and steady state analysis of LTI control systems and frequency response. Tools and techniques for LTI control system analysis: root loci, Routh-Hurwitz criterion, Bode and Nyquist plots. Control system compensators: elements of lead and lag compensation, elements of Proportional-Integral-Derivative (PID) control. State variable representation and solution of state equation of LTI control systems.");

        List<String> COMMUNICATIONS = new ArrayList<String>();
        COMMUNICATIONS.add("Random signals and noise: probability, random variables, probability density function, autocorrelation, power spectral density. Analog communication systems: amplitude and angle modulation and demodulation systems, spectral analysis of these operations, superheterodyne receivers; elements of hardware, realizations of analog communication systems; signal-to-noise ratio (SNR) calculations for amplitude modulation (AM) and frequency modulation (FM) for low noise conditions. Fundamentals of information theory and channel capacity theorem. Digital communication systems: pulse code modulation (PCM), differential pulse code modulation (DPCM), digital modulation schemes: amplitude, phase and frequency shift keying schemes (ASK, PSK, FSK), matched filter receivers, bandwidth consideration and probability of error calculations for these schemes. Basics of TDMA, FDMA and CDMA and GSM.");

        List<String> ELECTROMAGNETICS = new ArrayList<String>();
        ELECTROMAGNETICS.add("Elements of vector calculus: divergence and curl; Gauss’ and Stokes’ theorems, Maxwell’s equations: differential and integral forms. Wave equation, Poynting vector. Plane waves: propagation through various media; reflection and refraction; phase and group velocity; skin depth. Transmission lines: characteristic impedance; impedance transformation; Smith chart; impedance matching; S parameters, pulse excitation. Waveguides: modes in rectangular waveguides; boundary conditions; cut-off frequencies; dispersion relations. Basics of propagation in dielectric waveguide and optical fibers. Basics of Antennas: Dipole antennas; radiation pattern; antenna gain.");

/*
        listDataChild.put(listDataHeader.get(0), GENERALAPTITUDE);
        listDataChild.put(listDataHeader.get(1), ENGINEERINGMATHEMATICS);
        listDataChild.put(listDataHeader.get(2), NETWORKS);
        listDataChild.put(listDataHeader.get(3), ELECTRONICDEVICES);
        listDataChild.put(listDataHeader.get(4), ANALOGCIRCUITS);
        listDataChild.put(listDataHeader.get(5), DIGITALCIRCUITS);
        listDataChild.put(listDataHeader.get(6), SIGNALSANDSYSTEMS);
        listDataChild.put(listDataHeader.get(7), CONTROLSYSTEMS);
        listDataChild.put(listDataHeader.get(8), COMMUNICATIONS);
        listDataChild.put(listDataHeader.get(9), ELECTROMAGNETICS);
*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu1, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Bookmark:
                SharedPreferences bookmarks = getSharedPreferences("bookmarks", MODE_PRIVATE);
                String name = bookmarks.getString("EcesyllabusActivity", "");
                if (name.isEmpty()) {
                    bookmarks.edit().putString("EcesyllabusActivity", "EcesyllabusActivity.class");
                } else {
                    Toast.makeText(EcesyllabusActivity.this, "Already bookmarked", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this, Bookmark.class);
                    startActivity(intent);
                }
                break;
            case R.id.home:
                Intent i = new Intent(this, Gate1Activity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
                break;

            case R.id.logout:
                Intent j = new Intent(this, Logout.class);
                startActivity(j);
                break;

            case R.id.About:
                Intent k = new Intent(this, Aboutus.class);
                startActivity(k);
                break;


        }
        return true;

    }
}
