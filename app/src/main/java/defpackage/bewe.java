package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class bewe implements nn2 {
    public final xT a;
    public final d7G b;

    public bewe(xT xTVar, d7G d7g) {
        this.a = xTVar;
        this.b = d7g;
    }

    @Override // defpackage.nn2
    public final mn2 a(String str) {
        Sb1 sb1 = new Sb1(this.a.b(), 16, 2);
        d7G d7g = this.b;
        lKy3 lky3 = (lKy3) d7g.x;
        boolean zC = lky3.c(lky3.d(R.string.pref_retry_on_connection_loss), true);
        lKy3 lky4 = (lKy3) d7g.x;
        return new mn2(sb1, new fc4(str), new y63(zC, ps0.p0(lky4.e().getLong(lky4.d(R.string.pref_retry_duration_on_connection_loss), gq0.g(lKy3.v)), kq0.MILLISECONDS), (16 / 8) * 2 * ((xT) d7g.y).a()));
    }
}
