package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class aa1 implements GenericArrayType, Type {
    public final Type w;

    public aa1(Type type) {
        this.w = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            if (ur1.a(this.w, ((GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.w;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return pc5.a(this.w) + "[]";
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
