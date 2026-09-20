package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class fJOa extends cx1 implements j81<lKy3, sd5> {
    public final /* synthetic */ nyd w;
    public final /* synthetic */ If$.NUlFixed x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fJOa(nyd nydVar, If$.NUlFixed nUl) {
        super(1);
        this.w = nydVar;
        this.x = nUl;
    }

    @Override // defpackage.j81
    public final sd5 invoke(lKy3 lky3) {
        lKy3 lky4 = this.w.a;
        boolean z = this.x.a;
        lky4.g(lky4.d(R.string.pref_audio_track_enable_low_latency_key), z);
        a62.a.j("audio_track_low_latency", String.valueOf(z));
        return sd5.a;
    }
}
