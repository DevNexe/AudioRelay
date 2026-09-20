package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class su5 extends uu5 {
    public final long b;
    public final ArrayList c;
    public final ArrayList d;

    public su5(int i, long j) {
        super(i);
        this.b = j;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final su5 b(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            su5 su5Var = (su5) arrayList.get(i2);
            if (su5Var.a == i) {
                return su5Var;
            }
        }
        return null;
    }

    public final tu5 c(int i) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            tu5 tu5Var = (tu5) arrayList.get(i2);
            if (tu5Var.a == i) {
                return tu5Var;
            }
        }
        return null;
    }

    @Override // defpackage.uu5
    public final String toString() {
        return uu5.a(this.a) + " leaves: " + Arrays.toString(this.c.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
    }
}
