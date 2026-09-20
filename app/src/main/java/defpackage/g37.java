package defpackage;

import com.google.protobuf.byN;
import java.nio.charset.Charset;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class g37 {
    public static final c37 b = new c37();
    public final e37 a;

    public g37() {
        p37 p37Var;
        p37[] p37VarArr = new p37[2];
        p37VarArr[0] = i17.a;
        try {
            HashSet hashSet = byN.a;
            p37Var = (p37) byN.class.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            p37Var = b;
        }
        p37VarArr[1] = p37Var;
        e37 e37Var = new e37(p37VarArr);
        Charset charset = f27.a;
        this.a = e37Var;
    }
}
