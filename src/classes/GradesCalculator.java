/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Douglas Vinicius Dierings
 */
public class GradesCalculator {

    //Variables and arrays
    private int gradesQuantity;
    private double total;
    private final ArrayList<Double> listWeight = new ArrayList<>();
    private final ArrayList<Double> listGrades = new ArrayList<>();
    private final ArrayList<Double> result = new ArrayList<>();

    public void addGradesQuantity(int quantity) {
        gradesQuantity = quantity;
    }

    public void addGrade(double weight, double grade) {
        listWeight.add(weight);
        listGrades.add(grade);
    }

    public ArrayList calculateAverage() {
        for (int calc = 0; calc < gradesQuantity; calc++) {
            result.add(listWeight.get(calc) * listGrades.get(calc) / 100);
        }
        return result;
    }

    public double averageTotal() {
        for (double count : result) {
            total += count;
        }
        return total;

    }

    public void cleanLists() {
        listWeight.clear();
        listGrades.clear();
        result.clear();
    }

    //Getters and setters
    public int getGradesQuantity() {
        return gradesQuantity;
    }

    public void setGradesQuantity(int gradesQuantity) {
        this.gradesQuantity = gradesQuantity;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<Double> getResult() {
        return result;
    }

}
