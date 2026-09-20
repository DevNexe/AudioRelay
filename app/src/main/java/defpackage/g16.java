package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class g16 extends i16 {
    public final long P0;
    public final ArrayList Q0;
    public final ArrayList R0;

    public g16(int i, long j) {
        super(i);
        this.P0 = j;
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
    }

    public final g16 b(int i) {
        ArrayList arrayList = this.R0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            g16 g16Var = (g16) arrayList.get(i2);
            if (g16Var.a == i) {
                return g16Var;
            }
        }
        return null;
    }

    public final h16 c(int i) {
        ArrayList arrayList = this.Q0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            h16 h16Var = (h16) arrayList.get(i2);
            if (h16Var.a == i) {
                return h16Var;
            }
        }
        return null;
    }

    @Override // defpackage.i16
    public final String toString() {
        return i16.a(this.a) + " leaves: " + Arrays.toString(this.Q0.toArray()) + " containers: " + Arrays.toString(this.R0.toArray());
    }
}
