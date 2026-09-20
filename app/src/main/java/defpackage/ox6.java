package defpackage;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ox6 extends ay6 {
    public ox6(tx6 tx6Var, String str, Long l) {
        super(tx6Var, str, l);
    }

    @Override // defpackage.ay6
    @Nullable
    public final Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            this.a.getClass();
            Log.e("PhenotypeFlag", "Invalid long value for " + this.b + ": " + ((String) obj));
            return null;
        }
    }
}
