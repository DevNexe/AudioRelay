package defpackage;

import com.google.android.gms.internal.measurement.SjP;
import com.google.android.gms.internal.measurement.Xn1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class o27 {
    public SjP a;
    public ArrayList b;
    public ArrayList c;
    public long d;
    public final /* synthetic */ r27 e;

    public /* synthetic */ o27(r27 r27Var) {
        this.e = r27Var;
    }

    public final boolean a(long j, Xn1 xn1) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (!this.c.isEmpty() && ((((Xn1) this.c.get(0)).u() / 1000) / 60) / 60 != ((xn1.u() / 1000) / 60) / 60) {
            return false;
        }
        long jI = this.d + ((long) xn1.i());
        r27 r27Var = this.e;
        r27Var.G();
        if (jI >= Math.max(0, ((Integer) lg6.j.a(null)).intValue())) {
            return false;
        }
        this.d = jI;
        this.c.add(xn1);
        this.b.add(Long.valueOf(j));
        int size = this.c.size();
        r27Var.G();
        return size < Math.max(1, ((Integer) lg6.k.a(null)).intValue());
    }
}
