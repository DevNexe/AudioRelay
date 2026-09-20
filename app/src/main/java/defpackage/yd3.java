package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class yd3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ Object[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd3(String str, String str2, Object[] objArr) {
        super(2);
        this.w = str;
        this.x = str2;
        this.y = objArr;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) throws ClassNotFoundException {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            Object[] objArr = this.y;
            YKK.e(this.w, this.x, g30Var2, Arrays.copyOf(objArr, objArr.length));
        }
        return sd5.a;
    }
}
