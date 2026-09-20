package defpackage;

import com.google.android.gms.common.api.QnHx;
import com.google.android.gms.common.api.QnHx.F1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Hp<O extends QnHx.F1> {
    public final int a;
    public final QnHx<O> b;
    public final O c;
    public final String d;

    public Hp(QnHx<O> qnHx, O o, String str) {
        this.b = qnHx;
        this.c = o;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{qnHx, o, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Hp)) {
            return false;
        }
        Hp hp = (Hp) obj;
        return tq2.a(this.b, hp.b) && tq2.a(this.c, hp.c) && tq2.a(this.d, hp.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
