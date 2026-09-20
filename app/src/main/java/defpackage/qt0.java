package defpackage;

import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class qt0<T extends Enum<T>> implements rv1<T> {
    public final T[] a;
    public final ra4 b;

    public static final class QnHx extends cx1 implements j81<br, sd5> {
        public final /* synthetic */ qt0<T> w;
        public final /* synthetic */ String x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(qt0<T> qt0Var, String str) {
            super(1);
            this.w = qt0Var;
            this.x = str;
        }

        @Override // defpackage.j81
        public final sd5 invoke(br brVar) {
            br brVar2 = brVar;
            for (T t : this.w.a) {
                br.a(brVar2, t.name(), FWT.r(this.x + '.' + t.name(), uv4.LPt8Fixed.a, new pa4[0], ua4.w));
            }
            return sd5.a;
        }
    }

    public qt0(String str, T[] tArr) {
        this.a = tArr;
        this.b = FWT.r(str, xa4.CQf.a, new pa4[0], new QnHx(this, str));
    }

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return this.b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        ra4 ra4Var = this.b;
        int iS = pf0Var.S(ra4Var);
        T[] tArr = this.a;
        if (iS >= 0 && iS < tArr.length) {
            return tArr[iS];
        }
        throw new SerializationException(iS + " is not among valid " + ra4Var.a + " enum values, values size is " + tArr.length);
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        Enum r6 = (Enum) obj;
        T[] tArr = this.a;
        int iG0 = oV9.g0(tArr, r6);
        ra4 ra4Var = this.b;
        if (iG0 != -1) {
            ls0Var.T(ra4Var, iG0);
            return;
        }
        throw new SerializationException(r6 + " is not a valid enum " + ra4Var.a + ", must be one of " + Arrays.toString(tArr));
    }

    public final String toString() {
        return bl2.c(new StringBuilder("kotlinx.serialization.internal.EnumSerializer<"), this.b.a, '>');
    }
}
