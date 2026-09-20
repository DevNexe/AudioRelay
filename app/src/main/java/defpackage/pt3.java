package defpackage;

import android.os.Bundle;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class pt3 extends cx1 implements y81<kk2, g30, Integer, sd5> {
    public final /* synthetic */ xv0 w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt3(xv0 xv0Var, int i) {
        super(3);
        this.w = xv0Var;
        this.x = i;
    }

    @Override // defpackage.y81
    public final sd5 invoke(kk2 kk2Var, g30 g30Var, Integer num) {
        String string;
        g30 g30Var2 = g30Var;
        num.intValue();
        e40.CQf cQf = e40.a;
        Bundle bundle = kk2Var.y;
        p72 p72Var = null;
        if (bundle != null && (string = bundle.getString("destinationId", null)) != null) {
            for (k72 k72Var : l72.a) {
                if (ur1.a(k72Var.a, string)) {
                    p72Var = k72Var.b;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        x72.c(p72Var, this.w, g30Var2, (this.x >> 3) & 112);
        e40.CQf cQf2 = e40.a;
        return sd5.a;
    }
}
