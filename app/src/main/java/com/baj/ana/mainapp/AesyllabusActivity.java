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

public class AesyllabusActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aesyllabus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
 }

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
        listDataHeader.add("FLIGHT MECHANICS");
        listDataHeader.add("SPACE DYNAMICS");
        listDataHeader.add("AERODYNAMICS");
        listDataHeader.add("STRUCTURES");
        listDataHeader.add("PROPULSION");
*/


        // Adding child data
        List<String> GENERALAPTITUDE = new ArrayList<String>();
        GENERALAPTITUDE.add("Verbal Ability: English grammar, sentence completion, verbal analogies, word groups, instructions, critical reasoning and verbal deduction.");
        GENERALAPTITUDE.add("Numerical Ability: Numerical computation, numerical estimation, numerical");

        List<String> ENGINEERINGMATHEMATICS = new ArrayList<String>();
        ENGINEERINGMATHEMATICS.add("Linear Algebra: Matrix algebra; Systems of linear equations; Eigen values and Eigen vectors.");
        ENGINEERINGMATHEMATICS.add("Calculus: Functions of single variable; Limit, continuity and differentiability; Mean value theorems, local maxima and minima, Taylor and Maclaurin series; Evaluation of definite and indefinite integrals, application of definite integral to obtain area and volume; Partial derivatives; Total derivative; Gradient, Divergence and Curl, Vector identities, Directional derivatives, Line, Surface and Volume integrals, Stokes, Gauss and Green’s theorems.");
        ENGINEERINGMATHEMATICS.add("Differential equations: First order equation (linear and nonlinear), Higher order linear differential equations with constant coefficients, Method of variation of parameters, Cauchy’s and Euler’s equations, Initial and boundary value problems, Partial Differential Equations and variable separable method.");
        ENGINEERINGMATHEMATICS.add("Numerical Methods: Numerical solution of linear and nonlinear algebraic equations, integration by trapezoidal and Simpson rule, single and multi-step methods for differential equations.");

        List<String> FLIGHTMECHANICS = new ArrayList<String>();
        FLIGHTMECHANICS.add("Atmosphere: Properties, standard atmosphere. Classification of aircraft. Airplane (fixed wing aircraft) configuration and various parts.");
        FLIGHTMECHANICS.add("Airplane performance: Pressure altitude; equivalent, calibrated, indicated air speeds; Primary flight instruments: Altimeter, ASI, VSI, Turn-bank indicator. Drag polar; takeoff and landing; steady climb & descent,-absolute and service ceiling; cruise, cruise climb, endurance or loiter; load factor, turning flight, V-n diagram; Winds: head, tail & cross winds.");
        FLIGHTMECHANICS.add("Static stability: Angle of attack, sideslip; roll, pitch & yaw controls; longitudinal stick fixed & free stability, horizontal tail position and size; directional stability, vertical tail position and size; dihedral stability. Wing dihedral, sweep & position; hinge moments, stick forces.");
        FLIGHTMECHANICS.add("Dynamic stability: Euler angles; Equations of motion; aerodynamic forces and moments, Stability & control derivatives; decoupling of longitudinal and lat-directional dynamics; longitudinal modes; lateral dimensional modes.");

        List<String> SPACEDYNAMICS = new ArrayList<String>();
        SPACEDYNAMICS.add("Soil Mechanics: Origin of soils, soil structure and fabric; Three-phase system and phase relationships, index properties; Unified and Indian standard soil classification system; Permeability – one dimensional flow, Darcy’s law; Seepage through soils – two-dimensional flow, flow nets, uplift pressure, piping; Principle of effective stress, capillarity, seepage force and quicksand condition; Compaction in laboratory andfield conditions; Onedimensional consolidation, time rate of consolidation; Mohr’s circle, stress paths, effective and total shear strength parameters, characteristics of clays and sand.");

        List<String> AERODYNAMICS = new ArrayList<String>();
        AERODYNAMICS.add("Basic Fluid Mechanics: Incompressible irrotational flow, Helmholtz and Kelvin theorem, singularities and superposition, viscous flows, boundary layer on a flat plate ");
        AERODYNAMICS.add("Airfoils and wings: Classification of airfoils, aerodynamic characteristics, high lift devices, KuttaJoukowski theorem; lift generation; thin airfoil theory; wing theory; induced drag; qualitative treatment of low aspect ratio wings.");
        AERODYNAMICS.add("Viscous Flows: Flow separation, introduction to turbulence, transition, structure of a turbulent boundary layer.");
        AERODYNAMICS.add("Compressible Flows: Dynamics and Thermodynamics of I-D flow, isentropic flow, normal shock, oblique shock, Prandtl-Meyer flow, flow in nozzles and diffusers, inviscid flow in a c- d nozzle, flow in diffusers. subsonic and supersonic airfoils, compressibility effects on lift and drag, critical and drag divergence Mach number, wave drag.");
        AERODYNAMICS.add("Wind Tunnel Testing: Measurement and visualization techniques.");

        List<String> STRUCTURES = new ArrayList<String>();
        STRUCTURES.add("Stress and Strain: Equations of equilibrium, constitutive law, strain-displacement relationship, compatibility equations, plane stress and strain, Airy’s stress function.");
        STRUCTURES.add("Flight Vehicle Structures: Characteristics of aircraft structures and materials, torsion, bending and flexural shear. Flexural shear flow in thin-walled sections. Buckling. Failure theories. Loads on aircraft.");
        STRUCTURES.add("Structural Dynamics: Free and forced vibration of discrete systems. Damping and resonance. Dynamics of continuous systems.");

        List<String> PROPULSION = new ArrayList<String>();
        PROPULSION.add("Thermodynamics of Aircraft Gas Turbine engines thrust and thrust augmentation.");
        PROPULSION.add("Turbo machinery: Axial compressors and turbines, centrifugal pumps and compressors.");
        PROPULSION.add("Aerothermodynamics of non-rotating propulsion components: Intakes, combustor and nozzle. Thermodynamics of ramjets and scramjets. Elements of rocket propulsion.");
/*

        listDataChild.put(listDataHeader.get(0), GENERALAPTITUDE);
        listDataChild.put(listDataHeader.get(1), ENGINEERINGMATHEMATICS);
        listDataChild.put(listDataHeader.get(2), FLIGHTMECHANICS);
        listDataChild.put(listDataHeader.get(3), SPACEDYNAMICS);
        listDataChild.put(listDataHeader.get(4), AERODYNAMICS);
        listDataChild.put(listDataHeader.get(5), STRUCTURES);
        listDataChild.put(listDataHeader.get(6), PROPULSION);

*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu1,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.Bookmark:
                SharedPreferences bookmarks = getSharedPreferences("bookmarks", MODE_PRIVATE);
                String name = bookmarks.getString("AesyllabusActivity", "");
                if (name.isEmpty())
                {
                    bookmarks.edit().putString("AesyllabusActivity","AesyllabusActivity.class").apply();
                }
                else
                {
                    Intent intent = new Intent(this, Bookmark.class);
                    startActivity(intent);
                    Toast.makeText(AesyllabusActivity.this, "Already bookmarked", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.home:
                Intent i=new Intent(this,Gate1Activity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
                break;

            case R.id.logout:
                Intent j=new Intent(this,Logout.class);
                startActivity(j);
                break;

            case R.id.About:
                Intent k=new Intent(this,Aboutus.class);
                startActivity(k);
                break;


        }
        return true;

    }

}
