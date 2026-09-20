package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yb5 implements TypeVariable<GenericDeclaration>, Type {
    public final uv1 w;

    public yb5(uv1 uv1Var) {
        this.w = uv1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !ur1.a(getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List<sv1> upperBounds = this.w.getUpperBounds();
        ArrayList arrayList = new ArrayList(mu.w0(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(pc5.b((sv1) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new lp2(b70.a("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.w));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.w.getName();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }
}
