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
import android.webkit.WebView;

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

public class EeesyllabusActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eeesyllabus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    /*

        // get the listview
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
                expListView.expandGroup(groupPosition);
                return true;
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
    private void prepareListData()
    {
        /*
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("GENERAL APTITUDE");
        listDataHeader.add("ENGINEERING MATHEMATICS");
        listDataHeader.add("ELECTRIC CIRCUITS");
        listDataHeader.add("ELECTROMAGNETIC FIELDS");
        listDataHeader.add("SIGNALS AND SYSTEMS");
        listDataHeader.add("ELECTRICAL MACHINES");
        listDataHeader.add("POWER SYSTEMS");
        listDataHeader.add("CONTROL SYSTEMS");
        listDataHeader.add("ELECTRICAL AND ELECTRONIC MEASUREMENTS");
        listDataHeader.add("ANALOG AND DIGITAL ELECTRONICS");
        listDataHeader.add("POWER ELECTRONICS");
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


        List<String> ELECTRICCIRCUITS = new ArrayList<String>();
        ELECTRICCIRCUITS.add("Network graph, KCL, KVL, Node and Mesh analysis, Transient response of dc and ac networks, Sinusoidal steady‐state analysis, Resonance, Passive filters, Ideal current and voltage sources, Thevenin’s theorem, Norton’s theorem, Superposition theorem, Maximum power transfer theorem, Two‐port networks, Three phase circuits, Power and power factor in ac circuits.");

        List<String> ELECTROMAGNETICFIELDS = new ArrayList<String>();
        ELECTROMAGNETICFIELDS.add("Coulomb’s Law, Electric Field Intensity, Electric Flux Density, Gauss’s Law, Divergence, Electric field and potential due to point, line, plane and spherical charge distributions, Effect of dielectric medium,Capacitance of simple configurations, Biot‐Savart’s law, Ampere’s law, Curl, Faraday’s law, Lorentz force, Inductance, Magnetomotive force, Reluctance, Magnetic circuits,Self and Mutual inductance of simple configurations");

        List<String> SIGNALSANDSYSTEMS = new ArrayList<String>();
        SIGNALSANDSYSTEMS.add("Representation of continuous and discrete‐time signals, Shifting and scaling operations, Linear Time Invariant and Causal systems, Fourier series representation of continuous periodic signals,Sampling theorem, Applications of Fourier Transform, Laplace Transform and z-Transform.");


        List<String> ELECTRICALMACHINES = new ArrayList<String>();
        ELECTRICALMACHINES.add("Single phase transformer: equivalent circuit, phasor diagram, open circuit and short circuit tests,regulation and efficiency; Three phase transformers: connections, parallel operation; Autotransformer, Electromechanical energy conversion principles, DC machines: separately excited, series and shunt, motoring and generating mode of operation and their characteristics, starting and speed control of dc motors; Three phase induction motors: principle of operation, types, performance, torque-speed characteristics, no-load and blocked rotor tests, equivalent circuit, starting and speed control; Operating principle of single phase induction motors; Synchronous machines: cylindrical and salient pole machines, performance, regulation and parallel operation of generators, starting of synchronous motor, characteristics; Types of losses and efficiency calculations of electric machines.");


        List<String> POWERSYSTEMS = new ArrayList<String>();
        POWERSYSTEMS.add("Power generation concepts, ac and dc transmission concepts, Models and performance of transmission lines and cables, Series and shunt compensation, Electric field distribution andinsulators, Distribution systems, Per‐unit quantities, Bus admittance matrix, GaussSeidel and Newton-Raphson load flow methods, Voltage and Frequency control, Power factor correction,Symmetrical components, Symmetrical and unsymmetrical fault analysis, Principles of over‐current, differential and distance protection Circuit breakers, System stability concepts, Equal area criterion.");

        List<String> CONTROLSYSTEMS = new ArrayList<String>();


        CONTROLSYSTEMS.add("Mathematical modeling and representation of systems, Feedback principle, transfer function, Block diagrams and Signal flow graphs, Transient and Steady‐state analysis of linear time invariant systems, Routh-Hurwitz and Nyquist criteria, Bode plots, Root loci, Stability analysis, Lag, Lead and Lead‐Lag compensators P, PI and PID controllers; State space model, State transition matrix.");

        List<String> ELECTRICALANDELECTRONICMEASUREMENTS = new ArrayList<String>();
        ELECTRICALANDELECTRONICMEASUREMENTS.add("Bridges and Potentiometers, Measurement of voltage, current, power, energy and power factor Instrument transformers, Digital voltmeters and multimeters, Phase, Time and Frequencymeasurement; Oscilloscopes, Error analysis.");

        List<String> ANALOGANDDIGITALELECTRONICS = new ArrayList<String>();
        ANALOGANDDIGITALELECTRONICS.add("Characteristics of diodes, BJT, MOSFET; Simple diode circuits: clipping, clamping, rectifiers; Amplifiers: Biasing, Equivalent circuit and Frequency response; Oscillators and Feedback amplifiers; Operational amplifiers: Characteristics and applications; Simple active filters, VCOs and Timers, Combinational and Sequential logic circuits, Multiplexer, Demultiplexer, Schmitt trigger, Sample and hold circuits, A/D and D/A converters, 8085Microprocessor: Architecture, Programming and Interfacing.");

        List<String> POWERELECTRONICS = new ArrayList<String>();
        POWERELECTRONICS.add("Characteristics of semiconductor power devices: Diode, Thyristor, Triac, GTO, MOSFET, IGBT; DC to DC conversion: Buck, Boost and Buck-Boost converters; Single and three phase configuration of uncontrolled rectifiers, Line commutated thyristor based converters, Bidirectional ac to dc voltage source converters, Issues of line current harmonics, Power factor, Distortion factor of ac to dc converters, Single phase and three phase inverters, Sinusoidal pulse width modulation.");


 /*       listDataChild.put(listDataHeader.get(0), GENERALAPTITUDE);
        listDataChild.put(listDataHeader.get(1), ENGINEERINGMATHEMATICS);
        listDataChild.put(listDataHeader.get(2), ELECTRICCIRCUITS);
        listDataChild.put(listDataHeader.get(3), ELECTROMAGNETICFIELDS);
        listDataChild.put(listDataHeader.get(4), SIGNALSANDSYSTEMS);
        listDataChild.put(listDataHeader.get(5), ELECTRICALMACHINES);
        listDataChild.put(listDataHeader.get(6), POWERSYSTEMS);
        listDataChild.put(listDataHeader.get(7), CONTROLSYSTEMS);
        listDataChild.put(listDataHeader.get(8), ELECTRICALANDELECTRONICMEASUREMENTS);
        listDataChild.put(listDataHeader.get(9), ANALOGANDDIGITALELECTRONICS);
        listDataChild.put(listDataHeader.get(10), POWERELECTRONICS);
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
                String name = bookmarks.getString("EeesyllabusActivity", "");
                if (name.isEmpty()) {
                    bookmarks.edit().putString("EeesyllabusActivity", "EeesyllabusActivity.class").apply();
                } else {
                    startActivity(new Intent(EeesyllabusActivity.this, Bookmark.class));
                    Toast.makeText(EeesyllabusActivity.this, "Already bookmarked", Toast.LENGTH_SHORT).show();
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
