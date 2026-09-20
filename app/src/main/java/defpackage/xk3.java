package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xk3 extends cx1 implements h81<sd5> {
    public final /* synthetic */ wh1<Object> w;
    public final /* synthetic */ d90 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk3(d90 d90Var, wh1 wh1Var) {
        super(0);
        this.w = wh1Var;
        this.x = d90Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        Iterator<Object> it = this.w.iterator();
        while (true) {
            wh1.QnHx qnHx = (wh1.QnHx) it;
            if (!qnHx.hasNext()) {
                return sd5.a;
            }
            this.x.m(qnHx.next());
        }
    }
}
