package defpackage;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class px6 extends ay6 {
    public px6(tx6 tx6Var, String str, Boolean bool) {
        super(tx6Var, str, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ay6
    @Nullable
    public final Object a(Object obj) {
        if (lw6.b.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (lw6.c.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        this.a.getClass();
        Log.e("PhenotypeFlag", "Invalid boolean value for " + this.b + ": " + ((String) obj));
        return null;
    }
}
