package com.epam.upskills.home_task_5;

public class Matrix {
    private int[] a;
    private int n;

    public Matrix(int nn) {
        n = nn;
        a = new int[n];
        for (int i = 0; i < n; i++) {
                a[i] = (int) (Math.random() * 10);
            }

        show();
    }

    public Matrix(int nn, int k) {
        n = nn;
        a = new int[n];
        for (int i = 0; i < n; i++) {
                a[i] = k;
        }
        if (k != 0) {
            show();
        }
    }

    public void show() {
        System.out.println("Maтрица : " + a.length );
        for (int i = 0; i < a.length; i++) { {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 2;
        int l = 4;
        Matrix p = new Matrix(n);
        Matrix q = new Matrix(l);
        Matrix r = new Matrix(n, 0);
        for (int i = 0; i < p.a.length; i++) {
                    r.a[i]+= p.a[i] ;
                }

            System.out.println("Произведение матриц: ");
            r.show();
        }
    }



