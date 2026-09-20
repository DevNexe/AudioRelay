package defpackage;

import com.google.android.gms.common.api.QnHx;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o15 implements QnHx.F1 {
    public static final o15 c = new o15();
    public final String b = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o15) {
            return tq2.a(this.b, ((o15) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }
}
