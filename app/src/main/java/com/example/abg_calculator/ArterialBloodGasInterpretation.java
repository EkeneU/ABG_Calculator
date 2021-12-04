package com.example.abg_calculator;

import java.util.Scanner;

public class ArterialBloodGasInterpretation {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String args[]) {
        ArterialBloodGasInterpretation Abgi= new ArterialBloodGasInterpretation();
        System.out.println("Enter the PH value.");
        double pH_abg=scanner.nextDouble();
        System.out.println("Enter the PaCO2 value in mmHg. ");
        double C02_abg=scanner.nextDouble();
        System.out.println("Enter the HCO3 vakue in mEq/L.");
        double HC03_abg=scanner.nextDouble();
        Abgi.Respiratory_Acidosis(pH_abg, C02_abg, HC03_abg);
        Abgi.Respiratory_Alkalosis(pH_abg, C02_abg, HC03_abg);
        Abgi.Metabolic_Acidosis(pH_abg, C02_abg, HC03_abg);
        Abgi.Metabolic_Alkalosis(pH_abg, C02_abg, HC03_abg);
    }
    public void Respiratory_Acidosis(double PH_input, double PaCO2, double HCO3) {
        if(PH_input<7.35 && PaCO2>45.0 && HCO3>=22 && HCO3<=28) {
            System.out.println("Respiratory Acidosis.");
        }
        else if(PH_input<=7.45 && PH_input>=7.35 && PaCO2>45.0 && HCO3>28.0) {
            System.out.println("Compensated Respiratory Acidosis / Compensated Metabolic Alkalosis.");
        }
    }
    public void Respiratory_Alkalosis(double PH_input, double PaCO2, double HCO3) {
        if(PH_input>7.45 && PaCO2<35.0 &&  HCO3>=22 && HCO3<=28 ) {
            System.out.println("Respiratory Alkalosis.");
        }
        else if(PH_input<=7.45 && PH_input>=7.35 && PaCO2<35.0 && HCO3<=22) {
            System.out.println("Compensated Respiratory Alkalosis / Compensated Metabolic Acidosis.");
        }
    }
    public void Metabolic_Acidosis(double PH_input, double PaCO2, double HCO3) {
        if(PH_input<7.35 && PaCO2>=35.0 && PaCO2<=45.0 && HCO3<=22) {
            System.out.println("Metabolic Acidosis.");
        }
    }
    public void Metabolic_Alkalosis(double PH_input, double PaCO2, double HCO3) {
        if(PH_input>7.45 && PaCO2>=35.0 && PaCO2<=45.0 && HCO3>28.0) {
            System.out.println("Metabolic Alkalosis.");
        }
    }
}

