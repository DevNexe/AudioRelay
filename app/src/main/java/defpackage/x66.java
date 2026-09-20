package defpackage;

import com.google.android.gms.internal.measurement.Com1Fixed;
import com.google.android.gms.internal.measurement.QX;
import com.google.android.gms.internal.measurement.o_K;
import com.google.android.gms.internal.measurement.zzd;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x66 {
    public final jj6 a;
    public ma5 b;
    public final xi5 c;
    public final id7 d;

    public x66() {
        jj6 jj6Var = new jj6();
        this.a = jj6Var;
        this.b = jj6Var.b.a();
        this.c = new xi5();
        this.d = new id7();
        r67 r67Var = new r67(this, 1);
        rz6 rz6Var = jj6Var.d;
        rz6Var.a.put("internal.registerCallback", r67Var);
        rz6Var.a.put("internal.eventLogger", new iw5(this, 1));
    }

    public final void a(o_K o_k) {
        uw5 uw5Var;
        jj6 jj6Var = this.a;
        try {
            this.b = jj6Var.b.a();
            if (jj6Var.a(this.b, (QX[]) o_k.t().toArray(new QX[0])) instanceof uv5) {
                throw new IllegalStateException("Program loading failed");
            }
            for (Com1Fixed com1 : o_k.r().u()) {
                d27 d27VarT = com1.t();
                String strS = com1.s();
                Iterator it = d27VarT.iterator();
                while (it.hasNext()) {
                    ez5 ez5VarA = jj6Var.a(this.b, (QX) it.next());
                    if (!(ez5VarA instanceof hy5)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    ma5 ma5Var = this.b;
                    if (ma5Var.j(strS)) {
                        ez5 ez5VarD = ma5Var.d(strS);
                        if (!(ez5VarD instanceof uw5)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strS)));
                        }
                        uw5Var = (uw5) ez5VarD;
                    } else {
                        uw5Var = null;
                    }
                    if (uw5Var == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strS)));
                    }
                    uw5Var.d(this.b, Collections.singletonList(ez5VarA));
                }
            }
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final boolean b(ds5 ds5Var) throws zzd {
        xi5 xi5Var = this.c;
        try {
            xi5Var.x = ds5Var;
            xi5Var.y = ds5Var.clone();
            ((List) xi5Var.z).clear();
            this.a.c.h("runtime.counter", new gw5(Double.valueOf(0.0d)));
            this.d.a(this.b.a(), xi5Var);
            return (((ds5) xi5Var.y).equals((ds5) xi5Var.x) ^ true) || (((List) xi5Var.z).isEmpty() ^ true);
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }
}
