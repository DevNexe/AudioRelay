package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class em0 implements m24 {
    public final h81<sd5> a;
    public final /* synthetic */ m24 b;

    public em0(n24 n24Var, fm0 fm0Var) {
        this.a = fm0Var;
        this.b = n24Var;
    }

    @Override // defpackage.m24
    public final boolean a(Object obj) {
        return this.b.a(obj);
    }

    @Override // defpackage.m24
    public final m24.QnHx b(String str, h81<? extends Object> h81Var) {
        return this.b.b(str, h81Var);
    }

    @Override // defpackage.m24
    public final Map<String, List<Object>> c() {
        return this.b.c();
    }

    @Override // defpackage.m24
    public final Object d(String str) {
        return this.b.d(str);
    }
}
