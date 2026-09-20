package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hm3 implements m70 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ss3 x;

    public /* synthetic */ hm3(ss3 ss3Var, int i) {
        this.w = i;
        this.x = ss3Var;
    }

    @Override // defpackage.m70
    public final void accept(Object obj) {
        int i = this.w;
        ss3 ss3Var = this.x;
        switch (i) {
            case 0:
                lKy3 lky3 = (lKy3) ss3Var.y;
                lky3.e().edit().putLong(lky3.d(R.string.pref_max_elapsed_time_between_payloads_key), gq0.g(((gq0) obj).w)).apply();
                break;
            default:
                A$Y4 a$y4 = (A$Y4) obj;
                lKy3 lky4 = (lKy3) ss3Var.y;
                if (!lky4.o()) {
                    lky4.s(a$y4);
                } else {
                    a62.a.e("audio_output_already_set");
                }
                break;
        }
    }
}
