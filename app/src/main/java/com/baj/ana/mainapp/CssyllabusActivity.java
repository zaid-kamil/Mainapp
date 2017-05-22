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
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class CssyllabusActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cssyllabus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    /*

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        /*
        topicHeader = new ArrayList<String>();
        // Adding child data
        topicHeader.add("GENERAL APTITUDE");
        topicHeader.add("ENGINEERING MATHEMATICS");
        topicHeader.add("DIGITAL LOGIC");
        topicHeader.add("COMPUTER ORGANIZATION AND ARCHITECTURE");
        topicHeader.add("PROGRAMMING AND DATA STRUCTURES");
        topicHeader.add("ALGORITHMS");
        topicHeader.add("THEORY OF COMPUTATION");
        topicHeader.add("COMPILER DESIGN");
        topicHeader.add("OPERATING SYSTEM");
        topicHeader.add("DATABASES");
        topicHeader.add("COMPUTER NETWORKS");
*/

// Adding child data
        List<String> GENERAL_APTITUDE = new ArrayList<String>();
        GENERAL_APTITUDE.add("Verbal Ability: English grammar, sentence completion, verbal analogies, word groups, instructions, critical reasoning and verbal deduction.");
        GENERAL_APTITUDE.add("Numerical Ability: Numerical computation, numerical estimation, numerical");


        List<String> ENGINEERING_MATHEMATICS = new ArrayList<String>();
        ENGINEERING_MATHEMATICS.add("Discrete Mathematics: Propositional and first order logic. Sets, relations, functions, partial orders and lattices. Groups. Graphs: connectivity, matching, coloring. Combinatorics: counting, recurrence relations,generating functions.");
        ENGINEERING_MATHEMATICS.add("Linear Algebra: Matrices, determinants, system of linear equations, eigenvalues and eigenvectors, LU decomposition.");
        ENGINEERING_MATHEMATICS.add("Calculus: Limits, continuity and differentiability. Maxima and minima. Mean value theorem. Integration.");
        ENGINEERING_MATHEMATICS.add("Probability: Random variables. Uniform, normal, exponential, poisson and binomial distributions. Mean, median, mode and standard deviation. Conditional probability and Bayes theorem.");


        List<String> DIGITAL_LOGIC = new ArrayList<String>();
        DIGITAL_LOGIC.add("Boolean algebra. Combinational and sequential circuits. Minimization. Number representations and computer arithmetic (fixed and floating point).");

        List<String> COMPUTER_ORGANIZATION_AND_ARCHITECTURE = new ArrayList<String>();
        COMPUTER_ORGANIZATION_AND_ARCHITECTURE.add("Machine instructions and addressing modes. ALU, data‐path and control unit. Instruction pipelining. Memory hierarchy: cache, main memory and secondary storage; I/O interface (interrupt and DMA mode).");

        List<String> PROGRAMMING_AND_DATA_STRUCTURES = new ArrayList<String>();
        PROGRAMMING_AND_DATA_STRUCTURES.add("Programming in C. Recursion. Arrays, stacks, queues, linked lists, trees, binary search trees, binary heaps, graphs.");

        List<String> ALGORITHMS = new ArrayList<String>();
        ALGORITHMS.add("Searching, sorting, hashing. Asymptotic worst case time and space complexity. Algorithm design techniques: greedy, dynamic programming and divide‐and‐conquer. Graph search, minimum spanning trees, shortest paths.");

        List<String> THEORYOFCOMPUTATION = new ArrayList<String>();
        THEORYOFCOMPUTATION.add("Regular expressions and finite automata. Context-free grammars and push-down automata. Regular and contex-free languages, pumping lemma. Turing machines and undecidability.");

        List<String> COMPILERDESIGN = new ArrayList<String>();
        COMPILERDESIGN.add("Lexical analysis, parsing, syntax-directed translation. Runtime environments. Intermediate code generation.");

        List<String> OPERATINGSYSTEM = new ArrayList<String>();
        OPERATINGSYSTEM.add("Processes, threads, inter‐process communication, concurrency and synchronization. Deadlock. CPU scheduling. Memory management and virtual memory. File systems.");

        List<String> DATABASES = new ArrayList<String>();
        DATABASES.add("ER‐model. Relational model: relational algebra, tuple calculus, SQL. Integrity constraints, normal forms. File organization, indexing (e.g., B and B+ trees). Transactions and concurrency control.");

        List<String> COMPUTERNETWORKS = new ArrayList<String>();
        COMPUTERNETWORKS.add("Concept of layering. LAN technologies (Ethernet). Flow and error control techniques, switching. IPv4/IPv6, routers and routing algorithms (distance vector, link state). TCP/UDP and sockets, congestion control. Application layer protocols (DNS, SMTP, POP, FTP, HTTP). Basics of Wi-Fi. Network security: authentication, basics of public key and private key cryptography, digital signatures and certificates, firewalls.");




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
                String name = bookmarks.getString("CssyllabusActivity", "");
                if (name.isEmpty()) {
                    bookmarks.edit().putString("CssyllabusActivity", "CssyllabusActivity.class").apply();
                } else {
                    Toast.makeText(CssyllabusActivity.this, "Already bookmarked", Toast.LENGTH_SHORT).show();
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



