package defpackage;

import com.google.android.gms.internal.ads.zzgox;
import com.google.protobuf.byN;
import java.nio.charset.Charset;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class hu6 {
    public static final fu6 b = new fu6();
    public final gu6 a;

    public hu6() {
        lu6 lu6Var;
        lu6[] lu6VarArr = new lu6[2];
        lu6VarArr[0] = xt6.a;
        try {
            HashSet hashSet = byN.a;
            lu6Var = (lu6) byN.class.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            lu6Var = b;
        }
        lu6VarArr[1] = lu6Var;
        gu6 gu6Var = new gu6(lu6VarArr);
        Charset charset = zzgox.a;
        this.a = gu6Var;
    }
}
