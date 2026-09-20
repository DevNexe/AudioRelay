package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a12 extends cx1 implements j81<b43.QnHx, sd5> {
    public final /* synthetic */ List<f12> w;
    public final /* synthetic */ f12 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a12(ArrayList arrayList, f12 f12Var) {
        super(1);
        this.w = arrayList;
        this.x = f12Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(b43.QnHx qnHx) {
        f12 f12Var;
        b43.QnHx qnHx2 = qnHx;
        List<f12> list = this.w;
        int size = list.size();
        int i = 0;
        while (true) {
            f12Var = this.x;
            if (i >= size) {
                break;
            }
            f12 f12Var2 = list.get(i);
            if (f12Var2 != f12Var) {
                f12Var2.e(qnHx2);
            }
            i++;
        }
        if (f12Var != null) {
            f12Var.e(qnHx2);
        }
        return sd5.a;
    }
}
