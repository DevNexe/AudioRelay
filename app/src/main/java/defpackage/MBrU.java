package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class MBrU extends cx1 implements h81<Boolean> {
    public final /* synthetic */ lKy3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBrU(lKy3 lky3) {
        super(0);
        this.w = lky3;
    }

    @Override // defpackage.h81
    public final Boolean invoke() {
        lKy3 lky3 = this.w;
        return Boolean.valueOf(lky3.c(lky3.d(R.string.pref_analytics_key), true));
    }
}
