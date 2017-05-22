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

public class Mesyllabus2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesyllabus2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
/*
        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(Mesyllabus2Activity.this, listDataHeader, listDataChild);

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
        listDataHeader.add("MECHANICS AND DESIGN");
        listDataHeader.add("FLUID MECHANICS AND THERMAL SCIENCES");
        listDataHeader.add("MATERIALS, MANUFACTURING AND INDUSTRIAL ENGINEERING");

*/
        // Adding child data
        List<String> GENERALAPTITUDE = new ArrayList<String>();
        GENERALAPTITUDE.add("Verbal Ability: English grammar, sentence completion, verbal analogies, word groups, instructions, critical reasoning and verbal deduction.");
        GENERALAPTITUDE.add("Numerical Ability: Numerical computation, numerical estimation, numerical");


        List<String> ENGINEERINGMATHEMATICS = new ArrayList<String>();
        ENGINEERINGMATHEMATICS.add("Linear Algebra: Matrix algebra; Systems of linear equations; Eigen values and Eigen vectors.");
        ENGINEERINGMATHEMATICS.add("Calculus: Functions of single variable; Limit, continuity and differentiability; Mean value theorems, local maxima and minima, Taylor and Maclaurin series; Evaluation of definite and indefinite integrals, application of definite integral to obtain area and volume; Partial derivatives; Total derivative; Gradient, Divergence and Curl, Vector identities, Directional derivatives, Line, Surface and Volume integrals, Stokes, Gauss and Green’s theorems.");
        ENGINEERINGMATHEMATICS.add("Differential equations: First order equations (linear and nonlinear); higher order linear differential equations with constant coefficients; Euler-Cauchy equation; initial and boundary value problems; Laplace transforms; solutions of heat, wave and Laplace’s equations.");
        ENGINEERINGMATHEMATICS.add("Complex variables: Analytic functions; Cauchy-Riemann equations; Cauchy’s integral theorem and integral formula; Taylor and Laurent series.");
        ENGINEERINGMATHEMATICS.add("Probability and Statistics: Definitions of probability, sampling theorems, conditional probability; mean, median, mode and standard deviation; random variables, binomial, Poisson and normal distributions.");
        ENGINEERINGMATHEMATICS.add("Numerical Methods: Numerical solutions of linear and non-linear algebraic equations; integration by trapezoidal and Simpson’s rules; single and multi-step methods for differential equations.");

        List<String> MECHANICSANDDESIGN = new ArrayList<String>();
        MECHANICSANDDESIGN.add("Engineering Mechanics: System of forces, free-body diagrams, equilibrium equations; Internal forces in structures; Friction and its applications; Kinematics of point mass and rigid body; Centre of mass; Euler’s equations of motion; Impulse-momentum; Energy methods; Principles of virtual work.");
        MECHANICSANDDESIGN.add("Solid Mechanics: Bending moment and shear force in statically determinate beams; Simple stress and strain relationships; Theories of failures; Simple bending theory, flexural and shear stresses, shear centre; Uniform torsion, buckling of column, combined and direct bending stresses.");
        MECHANICSANDDESIGN.add("Structural Analysis: Statically determinate and indeterminate structures by force/ energy methods; Method of superposition; Analysis of trusses, arches, beams, cables and frames; Displacement methods: Slope deflection and moment distribution methods; Influence lines; Stiffness and flexibility methods of structural analysis.");
        MECHANICSANDDESIGN.add("Construction Materials and Management: Construction Materials: Structural steel – composition, material properties and behaviour; Concrete – constituents, mix design, short-term and long-term properties; Bricks and mortar; Timber; Bitumen. Construction Management: Types of construction projects; Tendering and construction contracts; Rate analysis and standard specifications; Cost estimation; Project planning and network analysis – PERT and CPM. ");
        MECHANICSANDDESIGN.add("Concrete Structures: Working stress, Limit state and Ultimate load design concepts; Design of beams, slabs, columns; Bond and development length; Prestressed concrete; Analysis of beam sections at transfer and service loads.");
        MECHANICSANDDESIGN.add("Steel Structures: Working stress and Limit state design concepts; Design of tension and compression members, beams and beam- columns, column bases; Connections – simple and eccentric, beam-column connections, plate girders and trusses; Plastic analysis of beams and frames");

        List<String> FLUIDMECHANICSANDTHERMALSCIENCES = new ArrayList<String>();
        FLUIDMECHANICSANDTHERMALSCIENCES.add("Fluid Mechanics: Fluid properties; fluid statics, manometry, buoyancy, forces on submerged bodies, stability of floating bodies; control-volume analysis of mass, momentum and energy; fluid acceleration; differential equations of continuity and momentum; Bernoulli’s equation; dimensional analysis; viscous flow of incompressible fluids, boundary layer, elementary turbulent flow, flow through pipes, head losses in pipes, bends and fittings.");
        FLUIDMECHANICSANDTHERMALSCIENCES.add("Heat-Transfer: Modes of heat transfer; one dimensional heat conduction, resistance concept and electrical analogy, heat transfer through fins; unsteady heat conduction, lumped parameter system, Heisler’s charts; thermal boundary layer, dimensionless parameters in free and forced convective heat transfer, heat transfer correlations for flow over flat plates and through pipes, effect of turbulence; heat exchanger performance, LMTD and NTU methods; radiative heat transfer, StefanBoltzmann law, Wien’s displacement law, black and grey surfaces, view factors, radiation network analysis.");
        FLUIDMECHANICSANDTHERMALSCIENCES.add("Thermodynamics: Thermodynamic systems and processes; properties of pure substances, behaviour of ideal and real gases; zeroth and first laws of thermodynamics, calculation of work and heat in various processes; second law of thermodynamics; thermodynamic property charts and tables, availability and irreversibility; thermodynamic relations.");
        FLUIDMECHANICSANDTHERMALSCIENCES.add("Applications: Power Engineering: Air and gas compressors; vapour and gas power cycles, concepts of regeneration and reheat. I.C. Engines: Air-standard Otto, Diesel and dual cycles. Refrigeration and air-conditioning: Vapour and gas refrigeration and heat pump cycles; properties of moist air, psychrometric chart, basic psychrometric processes. Turbomachinery: Impulse and reaction principles, velocity diagrams, Pelton-wheel, Francis and Kaplan turbines.");

        List<String> MATERIALS_MANUFACTURINGANDINDUSTRIALENGINEERING = new ArrayList<String>();
        MATERIALS_MANUFACTURINGANDINDUSTRIALENGINEERING.add("Engineering Materials: Structure and properties of engineering materials, phase diagrams, heat treatment, stress-strain diagrams for engineering materials.");
        MATERIALS_MANUFACTURINGANDINDUSTRIALENGINEERING.add("Casting, Forming and Joining Processes: Different types of castings, design of patterns, moulds and cores; solidification and cooling; riser and gating design. Plastic deformation and yield criteria; fundamentals of hot and cold working processes; load estimation for bulk (forging, rolling, extrusion, drawing) and sheet (shearing, deep drawing, bending) metal forming processes; principles of powder metallurgy. Principles of welding, brazing, soldering and adhesive bonding.");
        MATERIALS_MANUFACTURINGANDINDUSTRIALENGINEERING.add("Machining and Machine Tool Operations: Mechanics of machining; basic machine tools; single and multi-point cutting tools, tool geometry and materials, tool life and wear; economics of machining; principles of non-traditional machining processes; principles of work holding, design of jigs and fixtures.");

/*
        listDataChild.put(listDataHeader.get(0), GENERALAPTITUDE);
        listDataChild.put(listDataHeader.get(1), ENGINEERINGMATHEMATICS);
        listDataChild.put(listDataHeader.get(2), MECHANICSANDDESIGN);
        listDataChild.put(listDataHeader.get(3), FLUIDMECHANICSANDTHERMALSCIENCES);
        listDataChild.put(listDataHeader.get(4), MATERIALS_MANUFACTURINGANDINDUSTRIALENGINEERING);
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
                String name = bookmarks.getString("Mesyllabus2Activity", "");
                if (name.isEmpty()) {
                    bookmarks.edit().putString("Mesyllabus2Activity", "Mesyllabus2Activity.class").apply();
                } else {
                    Toast.makeText(Mesyllabus2Activity.this, "Already bookmarked", Toast.LENGTH_SHORT).show();
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
