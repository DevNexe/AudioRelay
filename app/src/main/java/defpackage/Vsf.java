package defpackage;

import com.azefsw.audioconnect.R;
import com.google.protobuf.QnHx;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class Vsf implements es {
    public final lKy3 a;

    public Vsf(lKy3 lky3) {
        this.a = lky3;
    }

    @Override // defpackage.es
    public final uw0 a() {
        lKy3 lky3 = this.a;
        boolean zN = lky3.n();
        int i = lky3.e().getInt("OPUS_BITRATE", 128000);
        int iG = (int) gq0.g(ps0.p0(lky3.e().getLong(lky3.d(R.string.pref_max_elapsed_time_between_payloads_key), gq0.g(lKy3.u)), kq0.MILLISECONDS));
        uw0.CQf cQfC = uw0.H.c();
        mh2.CQf cQfC2 = mh2.D.c();
        cQfC2.A = !zN;
        cQfC2.M();
        cQfC2.C = iG;
        cQfC2.M();
        cQfC2.B = RCHTTPStatusCodes.ERROR;
        cQfC2.M();
        mh2 mh2VarF = cQfC2.f();
        if (!mh2VarF.isInitialized()) {
            throw QnHx.AbstractC0099QnHx.C(mh2VarF);
        }
        cQfC.A = mh2VarF;
        cQfC.M();
        iu4.CQf cQfC3 = iu4.B.c();
        cQfC3.A = true;
        cQfC3.M();
        iu4 iu4VarF = cQfC3.f();
        if (!iu4VarF.isInitialized()) {
            throw QnHx.AbstractC0099QnHx.C(iu4VarF);
        }
        cQfC.B = iu4VarF;
        cQfC.M();
        v40.CQf cQfC4 = v40.C.c();
        cQfC4.A = zN;
        cQfC4.M();
        cQfC4.B = i;
        cQfC4.M();
        v40 v40VarF = cQfC4.f();
        if (!v40VarF.isInitialized()) {
            throw QnHx.AbstractC0099QnHx.C(v40VarF);
        }
        cQfC.C = v40VarF;
        cQfC.M();
        xd2.CQf cQfC5 = xd2.B.c();
        cQfC5.A = true;
        cQfC5.M();
        xd2 xd2VarF = cQfC5.f();
        if (!xd2VarF.isInitialized()) {
            throw QnHx.AbstractC0099QnHx.C(xd2VarF);
        }
        cQfC.D = xd2VarF;
        cQfC.M();
        lq3.CQf cQfC6 = lq3.B.c();
        cQfC6.A = true;
        cQfC6.M();
        lq3 lq3VarF = cQfC6.f();
        if (!lq3VarF.isInitialized()) {
            throw QnHx.AbstractC0099QnHx.C(lq3VarF);
        }
        cQfC.E = lq3VarF;
        cQfC.M();
        sf3.CQf cQfC7 = sf3.B.c();
        cQfC7.A = true;
        cQfC7.M();
        sf3 sf3VarF = cQfC7.f();
        if (!sf3VarF.isInitialized()) {
            throw QnHx.AbstractC0099QnHx.C(sf3VarF);
        }
        cQfC.F = sf3VarF;
        cQfC.M();
        zf3.CQf cQfC8 = zf3.B.c();
        cQfC8.A = true;
        cQfC8.M();
        zf3 zf3VarF = cQfC8.f();
        if (!zf3VarF.isInitialized()) {
            throw QnHx.AbstractC0099QnHx.C(zf3VarF);
        }
        cQfC.G = zf3VarF;
        cQfC.M();
        uw0 uw0VarF = cQfC.f();
        if (uw0VarF.isInitialized()) {
            return uw0VarF;
        }
        throw QnHx.AbstractC0099QnHx.C(uw0VarF);
    }
}
