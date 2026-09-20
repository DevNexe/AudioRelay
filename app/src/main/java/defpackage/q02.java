package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q02 extends cx1 implements j81<yq1.QnHx<j02>, sd5> {
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ HashMap<Object, Integer> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q02(int i, int i2, HashMap<Object, Integer> map) {
        super(1);
        this.w = i;
        this.x = i2;
        this.y = map;
    }

    @Override // defpackage.j81
    public final sd5 invoke(yq1.QnHx<j02> qnHx) {
        yq1.QnHx<j02> qnHx2 = qnHx;
        j81<Integer, Object> j81Var = qnHx2.c.a;
        if (j81Var != null) {
            if (j81Var == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            int i = this.w;
            int i2 = qnHx2.a;
            int iMax = Math.max(i, i2);
            int iMin = Math.min(this.x, (qnHx2.b + i2) - 1);
            if (iMax <= iMin) {
                while (true) {
                    this.y.put(j81Var.invoke(Integer.valueOf(iMax - i2)), Integer.valueOf(iMax));
                    if (iMax == iMin) {
                        break;
                    }
                    iMax++;
                }
            }
        }
        return sd5.a;
    }
}
