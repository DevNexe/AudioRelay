package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmClassMappingKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ya4 extends lb4 {
    public final Map<fv1<?>, y80> a;
    public final Map<fv1<?>, Map<fv1<?>, rv1<?>>> b;
    public final Map<fv1<?>, j81<?, db4<?>>> c;
    public final Map<fv1<?>, Map<String, rv1<?>>> d;
    public final Map<fv1<?>, j81<String, zj0<?>>> e;

    public ya4() {
        ds0 ds0Var = ds0.w;
        this.a = ds0Var;
        this.b = ds0Var;
        this.c = ds0Var;
        this.d = ds0Var;
        this.e = ds0Var;
    }

    @Override // defpackage.lb4
    public final void a(t93 t93Var) {
        for (Map.Entry<fv1<?>, y80> entry : this.a.entrySet()) {
            entry.getKey();
            y80 value = entry.getValue();
            if (value instanceof y80.QnHx) {
                ((y80.QnHx) value).getClass();
                throw null;
            }
            if (value instanceof y80.CQf) {
                ((y80.CQf) value).getClass();
            }
        }
        for (Map.Entry<fv1<?>, Map<fv1<?>, rv1<?>>> entry2 : this.b.entrySet()) {
            entry2.getKey();
            for (Map.Entry<fv1<?>, rv1<?>> entry3 : entry2.getValue().entrySet()) {
                t93Var.a(entry3.getKey(), entry3.getValue());
            }
        }
        for (Map.Entry<fv1<?>, j81<?, db4<?>>> entry4 : this.c.entrySet()) {
            entry4.getKey();
            sb5.d(1, entry4.getValue());
        }
        for (Map.Entry<fv1<?>, j81<String, zj0<?>>> entry5 : this.e.entrySet()) {
            entry5.getKey();
            sb5.d(1, entry5.getValue());
        }
    }

    @Override // defpackage.lb4
    public final <T> rv1<T> b(fv1<T> fv1Var, List<? extends rv1<?>> list) {
        y80 y80Var = this.a.get(fv1Var);
        rv1<T> rv1VarA = y80Var != null ? y80Var.a() : null;
        if (rv1VarA instanceof rv1) {
            return rv1VarA;
        }
        return null;
    }

    @Override // defpackage.lb4
    public final zj0 c(String str, fv1 fv1Var) {
        Map<String, rv1<?>> map = this.d.get(fv1Var);
        rv1<?> rv1Var = map != null ? map.get(str) : null;
        if (!(rv1Var instanceof rv1)) {
            rv1Var = null;
        }
        if (rv1Var != null) {
            return rv1Var;
        }
        j81<String, zj0<?>> j81Var = this.e.get(fv1Var);
        j81<String, zj0<?>> j81Var2 = sb5.e(1, j81Var) ? j81Var : null;
        if (j81Var2 != null) {
            return j81Var2.invoke(str);
        }
        return null;
    }

    @Override // defpackage.lb4
    public final db4 d(Object obj, fv1 fv1Var) {
        if (!JvmClassMappingKt.getJavaObjectType(fv1Var).isInstance(obj)) {
            return null;
        }
        Map<fv1<?>, rv1<?>> map = this.b.get(fv1Var);
        rv1<?> rv1Var = map != null ? map.get(nl3.a(obj.getClass())) : null;
        if (!(rv1Var instanceof db4)) {
            rv1Var = null;
        }
        if (rv1Var != null) {
            return rv1Var;
        }
        j81<?, db4<?>> j81Var = this.c.get(fv1Var);
        j81<?, db4<?>> j81Var2 = sb5.e(1, j81Var) ? j81Var : null;
        if (j81Var2 != null) {
            return j81Var2.invoke(obj);
        }
        return null;
    }
}
