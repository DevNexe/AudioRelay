package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ct3 implements ex4, Closeable {
    public static final TreeMap<Integer, ct3> E = new TreeMap<>();
    public final byte[][] A;
    public final int[] B;
    public final int C;
    public int D;
    public volatile String w;
    public final long[] x;
    public final double[] y;
    public final String[] z;

    public ct3(int i) {
        this.C = i;
        int i2 = i + 1;
        this.B = new int[i2];
        this.x = new long[i2];
        this.y = new double[i2];
        this.z = new String[i2];
        this.A = new byte[i2][];
    }

    public static ct3 e(int i, String str) {
        TreeMap<Integer, ct3> treeMap = E;
        synchronized (treeMap) {
            Map.Entry<Integer, ct3> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                ct3 ct3Var = new ct3(i);
                ct3Var.w = str;
                ct3Var.D = i;
                return ct3Var;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            ct3 value = entryCeilingEntry.getValue();
            value.w = str;
            value.D = i;
            return value;
        }
    }

    @Override // defpackage.ex4
    public final String b() {
        return this.w;
    }

    @Override // defpackage.ex4
    public final void c(u61 u61Var) {
        for (int i = 1; i <= this.D; i++) {
            int i2 = this.B[i];
            if (i2 == 1) {
                u61Var.f(i);
            } else if (i2 == 2) {
                u61Var.e(i, this.x[i]);
            } else if (i2 == 3) {
                u61Var.c(this.y[i], i);
            } else if (i2 == 4) {
                u61Var.g(i, this.z[i]);
            } else if (i2 == 5) {
                u61Var.b(i, this.A[i]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void f(int i, long j) {
        this.B[i] = 2;
        this.x[i] = j;
    }

    public final void g(int i) {
        this.B[i] = 1;
    }

    public final void h(int i, String str) {
        this.B[i] = 4;
        this.z[i] = str;
    }

    public final void i() {
        TreeMap<Integer, ct3> treeMap = E;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.C), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }
}
