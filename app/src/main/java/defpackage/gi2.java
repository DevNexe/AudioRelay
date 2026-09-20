package defpackage;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class gi2<K, V> extends h92<K, V> implements mv1.QnHx {
    public final d13<K, V> y;
    public V z;

    public gi2(d13<K, V> d13Var, K k, V v) {
        super(k, v);
        this.y = d13Var;
        this.z = v;
    }

    @Override // defpackage.h92, java.util.Map.Entry
    public final V getValue() {
        return this.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.h92, java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = this.z;
        this.z = v;
        b13<K, V, Map.Entry<K, V>> b13Var = this.y.w;
        a13<K, V> a13Var = b13Var.z;
        K k = this.w;
        if (a13Var.containsKey(k)) {
            boolean z = b13Var.y;
            if (!z) {
                a13Var.put(k, v);
            } else {
                if (!z) {
                    throw new NoSuchElementException();
                }
                eb5 eb5Var = b13Var.w[b13Var.x];
                Object obj = eb5Var.w[eb5Var.y];
                a13Var.put(k, v);
                b13Var.c(obj != null ? obj.hashCode() : 0, a13Var.y, obj, 0);
            }
            b13Var.C = a13Var.A;
        }
        return v2;
    }
}
