package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ez2 implements ParameterizedType, Type {
    public final Class<?> w;
    public final Type x;
    public final Type[] y;

    public /* synthetic */ class QnHx extends l91 implements j81<Type, String> {
        public static final QnHx F = new QnHx();

        public QnHx() {
            super(1, pc5.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // defpackage.j81
        public final String invoke(Type type) {
            return pc5.a(type);
        }
    }

    public ez2(Class cls, Type type, ArrayList arrayList) {
        this.w = cls;
        this.x = type;
        this.y = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (ur1.a(this.w, parameterizedType.getRawType()) && ur1.a(this.x, parameterizedType.getOwnerType())) {
                if (Arrays.equals(this.y, parameterizedType.getActualTypeArguments())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.y;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.x;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.w;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class<?> cls = this.w;
        Type type = this.x;
        if (type != null) {
            sb.append(pc5.a(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(pc5.a(cls));
        }
        Type[] typeArr = this.y;
        if (!(typeArr.length == 0)) {
            QnHx qnHx = QnHx.F;
            sb.append((CharSequence) "<");
            int i = 0;
            for (Type type2 : typeArr) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                ddf.e(sb, type2, qnHx);
            }
            sb.append((CharSequence) ">");
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.w.hashCode();
        Type type = this.x;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.y);
    }

    public final String toString() {
        return getTypeName();
    }
}
