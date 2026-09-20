package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pp3 implements qu4 {
    public final vu4 b;
    public final List<Object> c;

    public pp3(vu4 vu4Var, List<? extends Object> list) {
        this.b = vu4Var;
        this.c = list;
    }

    @Override // defpackage.qu4
    public final String a(Context context) {
        String strA;
        qu4.a.getClass();
        qu4.QnHx.b.getClass();
        Resources resources = context.getResources();
        int i = this.b.w;
        List<Object> list = this.c;
        ArrayList arrayList = new ArrayList(mu.w0(list, 10));
        for (Object obj : list) {
            qu4 qu4Var = obj instanceof qu4 ? (qu4) obj : null;
            if (qu4Var != null && (strA = qu4Var.a(context)) != null) {
                obj = strA;
            }
            arrayList.add(obj);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        if (array != null) {
            return resources.getString(i, Arrays.copyOf(array, array.length));
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp3)) {
            return false;
        }
        pp3 pp3Var = (pp3) obj;
        return ur1.a(this.b, pp3Var.b) && ur1.a(this.c, pp3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "ResourceFormattedStringDesc(stringRes=" + this.b + ", args=" + this.c + ')';
    }
}
