package defpackage;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class qx6 extends ay6 {
    public qx6(tx6 tx6Var, Double d) {
        super(tx6Var, "measurement.test.double_flag", d);
    }

    @Override // defpackage.ay6
    @Nullable
    public final Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            this.a.getClass();
            Log.e("PhenotypeFlag", "Invalid double value for " + this.b + ": " + ((String) obj));
            return null;
        }
    }
}
