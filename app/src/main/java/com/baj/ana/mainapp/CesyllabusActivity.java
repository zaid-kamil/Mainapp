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

public class CesyllabusActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cesyllabus);
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
        listDataHeader.add("STRUCTURAL ENGINEERING");
        listDataHeader.add("GEOTECHNICAL ENGINEERING");
        listDataHeader.add("WATER RESOURCES ENGINEERING");
        listDataHeader.add("ENVIRONMENTAL ENGINEERING");
        listDataHeader.add("TRANSPORTATION ENGINEERING");
*/

        // Adding child data
        List<String> GENERALAPTITUDE = new ArrayList<String>();
        GENERALAPTITUDE.add("Verbal Ability: English grammar, sentence completion, verbal analogies, word groups, instructions, critical reasoning and verbal deduction.");
        GENERALAPTITUDE.add("Numerical Ability: Numerical computation, numerical estimation, numerical");


        List<String> ENGINEERINGMATHEMATICS = new ArrayList<String>();
        ENGINEERINGMATHEMATICS.add("Linear Algebra: Matrix algebra; Systems of linear equations; Eigen values and Eigen vectors.");
        ENGINEERINGMATHEMATICS.add("Calculus: Functions of single variable; Limit, continuity and differentiability; Mean value theorems, local maxima and minima, Taylor and Maclaurin series; Evaluation of definite and indefinite integrals, application of definite integral to obtain area and volume; Partial derivatives; Total derivative; Gradient, Divergence and Curl, Vector identities, Directional derivatives, Line, Surface and Volume integrals, Stokes, Gauss and Green’s theorems.");
        ENGINEERINGMATHEMATICS.add("Ordinary Differential Equation (ODE): First order (linear and non-linear) equations; higher order linear equations with constant coefficients; Euler-Cauchy equations; Laplace transform and its application in solving linear ODEs; initial and boundary value problems.");
        ENGINEERINGMATHEMATICS.add("Partial Differential Equation (PDE): Fourier series; separation of variables; solutions of onedimensional diffusion equation; first and second order one-dimensional wave equation and two-dimensional Laplace equation. ");
        ENGINEERINGMATHEMATICS.add("Probability and Statistics: Definitions of probability and sampling theorems; Conditional probability; Discrete Random variables: Poisson and Binomial distributions; Continuous random variables: normal and exponential distributions; Descriptive statistics – Mean, median, mode and standard deviation; Hypothesis testing.");
        ENGINEERINGMATHEMATICS.add("Numerical Methods: Accuracy and precision; error analysis. Numerical solutions of linear and non-linear algebraic equations; Least square approximation, Newton’s and Lagrange polynomials, numerical differentiation, Integration by trapezoidal and Simpson’s rule, single and multi-step methods for first order differential equations.");


        List<String> STRUCTURALENGINEERING = new ArrayList<String>();
        STRUCTURALENGINEERING.add("Engineering Mechanics: System of forces, free-body diagrams, equilibrium equations; Internal forces in structures; Friction and its applications; Kinematics of point mass and rigid body; Centre of mass; Euler’s equations of motion; Impulse-momentum; Energy methods; Principles of virtual work.");
        STRUCTURALENGINEERING.add("Solid Mechanics: Bending moment and shear force in statically determinate beams; Simple stress and strain relationships; Theories of failures; Simple bending theory, flexural and shear stresses, shear centre; Uniform torsion, buckling of column, combined and direct bending stresses.");
        STRUCTURALENGINEERING.add("Structural Analysis: Statically determinate and indeterminate structures by force/ energy methods; Method of superposition; Analysis of trusses, arches, beams, cables and frames; Displacement methods: Slope deflection and moment distribution methods; Influence lines; Stiffness and flexibility methods of structural analysis.");
        STRUCTURALENGINEERING.add("Construction Materials and Management: Construction Materials: Structural steel – composition, material properties and behaviour; Concrete – constituents, mix design, short-term and long-term properties; Bricks and mortar; Timber; Bitumen. Construction Management: Types of construction projects; Tendering and construction contracts; Rate analysis and standard specifications; Cost estimation; Project planning and network analysis – PERT and CPM. ");
        STRUCTURALENGINEERING.add("Concrete Structures: Working stress, Limit state and Ultimate load design concepts; Design of beams, slabs, columns; Bond and development length; Prestressed concrete; Analysis of beam sections at transfer and service loads.");
        STRUCTURALENGINEERING.add("Steel Structures: Working stress and Limit state design concepts; Design of tension and compression members, beams and beam- columns, column bases; Connections – simple and eccentric, beam-column connections, plate girders and trusses; Plastic analysis of beams and frames");

        List<String> GEOTECHNICALENGINEERING = new ArrayList<String>();
        GEOTECHNICALENGINEERING.add("Soil Mechanics: Origin of soils, soil structure and fabric; Three-phase system and phase relationships, index properties; Unified and Indian standard soil classification system; Permeability – one dimensional flow, Darcy’s law; Seepage through soils – two-dimensional flow, flow nets, uplift pressure, piping; Principle of effective stress, capillarity, seepage force and quicksand condition; Compaction in laboratory andfield conditions; Onedimensional consolidation, time rate of consolidation; Mohr’s circle, stress paths, effective and total shear strength parameters, characteristics of clays and sand.");
        GEOTECHNICALENGINEERING.add("Foundation Engineering: Sub-surface investigations – scope, drilling bore holes, sampling, plate load test, standard penetration and cone penetration tests; Earth pressure theories – Rankine and Coulomb; Stability of slopes – finite and infinite slopes, method of slices and Bishop’s method; Stress distribution in soils – Boussinesq’s and Westergaard’s theories, pressure bulbs; Shallow foundations – Terzaghi’s and Meyerhoff’s bearing capacity theories, effect of water table; Combined footing and raft foundation; Contact pressure; Settlement analysis in sands and clays; Deep foundations – types of piles, dynamic and static formulae, load capacity of piles in sands and clays, pile load test, negative skin friction.");

        List<String> WATERRESOURCESENGINEERING = new ArrayList<String>();
        WATERRESOURCESENGINEERING.add("Fluid Mechanics: Properties of fluids, fluid statics; Continuity, momentum, energy and corresponding equations; Potential flow, applications of momentum and energy equations; Laminar and turbulent flow; Flow in pipes, pipe networks; Concept of boundary layer and its growth.");
        WATERRESOURCESENGINEERING.add("Hydraulics: Forces on immersed bodies; Flow measurement in channels and pipes; Dimensional analysis and hydraulic similitude; Kinematics of flow, velocity triangles; Basics of hydraulic machines, specific speed of pumps and turbines; Channel Hydraulics – Energy-depth relationships, specific energy, critical flow, slope profile, hydraulic jump, uniform flow and gradually varied flow");
        WATERRESOURCESENGINEERING.add("Hydrology: Hydrologic cycle, precipitation, evaporation, evapo-transpiration, watershed, infiltration, unit hydrographs, hydrograph analysis, flood estimation and routing, reservoir capacity, reservoir and channel routing, surface run-off models, ground water hydrology – steady state well hydraulics and aquifers; Application of Darcy’s law.");
        WATERRESOURCESENGINEERING.add("Irrigation: Duty, delta, estimation of evapo-transpiration; Crop water requirements; Design of lined and unlined canals, head works, gravity dams and spillways; Design of weirs on permeable foundation; Types of irrigation systems, irrigation methods; Water logging and drainage; Canal regulatory works, cross-drainage structures, outlets and escapes.");


        List<String> ENVIRONMENTALENGINEERING = new ArrayList<String>();
        ENVIRONMENTALENGINEERING.add("Water and Waste Water: Quality standards, basic unit processes and operations for water treatment. Drinking water standards, water requirements, basic unit operations and unit processes for surface water treatment, distribution of water. Sewage and sewerage treatment, quantity and characteristics of wastewater. Primary, secondary and tertiary treatment of wastewater, effluent discharge standards. Domestic wastewater treatment, quantity of characteristics of domestic wastewater, primary and secondary treatment. Unit operations and unit processes of domestic wastewater, sludge disposal.");
        ENVIRONMENTALENGINEERING.add("Air Pollution: Types of pollutants, their sources and impacts, air pollution meteorology, air pollution control, air quality standards and limits.");
        ENVIRONMENTALENGINEERING.add("Municipal Solid Wastes: Characteristics, generation, collection and transportation of solid wastes, engineered systems for solid waste management (reuse/ recycle, energy recovery, treatment and disposal).");
        ENVIRONMENTALENGINEERING.add("Noise Pollution: Impacts of noise, permissible limits of noise pollution, measurement of noise and control of noise pollution.");


        List<String> TRANSPORTATIONENGINEERING = new ArrayList<String>();
        TRANSPORTATIONENGINEERING.add("Transportation Infrastructure: Highway alignment and engineering surveys; Geometric design of highways – cross-sectional elements, sight distances, horizontal and vertical alignments; Geometric design of railway track; Airport runway length, taxiway and exit taxiway design.");
        TRANSPORTATIONENGINEERING.add("Highway Pavements: Highway materials – desirable properties and quality control tests; Design of bituminous paving mixes; Design factors for flexible and rigid pavements; Design of flexible pavement using IRC: 37-2012; Design of rigid pavements using IRC: 58-2011; Distresses in concrete pavements.");
        TRANSPORTATIONENGINEERING.add("Traffic Engineering: Traffic studies on flow, speed, travel time – delay and O-D study, PCU, peak hour factor, parking study, accident study and analysis, statistical analysis of traffic data; Microscopic and macroscopic parameters of traffic flow, fundamental relationships; Control devices, signal design by Webster’s method; Types of intersections and channelization; Highway capacity and level of service of rural highways and urban roads.");


  /*      listDataChild.put(listDataHeader.get(0), GENERALAPTITUDE);
        listDataChild.put(listDataHeader.get(1), ENGINEERINGMATHEMATICS);
        listDataChild.put(listDataHeader.get(2), STRUCTURALENGINEERING);
        listDataChild.put(listDataHeader.get(3), GEOTECHNICALENGINEERING);
        listDataChild.put(listDataHeader.get(4), WATERRESOURCESENGINEERING);
        listDataChild.put(listDataHeader.get(5), ENVIRONMENTALENGINEERING);
        listDataChild.put(listDataHeader.get(6), TRANSPORTATIONENGINEERING);

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
                String name = bookmarks.getString("CesyllabusActivity", "");
                if (name.isEmpty()) {
                    bookmarks.edit().putString("CesyllabusActivity", "CesyllabusActivity.class").apply();
                } else {
                    Toast.makeText(CesyllabusActivity.this, "Already bookmarked", Toast.LENGTH_SHORT).show();
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
