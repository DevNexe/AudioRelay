package defpackage;

import android.content.Context;
import android.os.Build;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class s23 {
    public final Context a;
    public final lKy3 b;
    public final w9<Boolean> c = new w9<>();

    public s23(Context context, lKy3 lky3) {
        this.a = context;
        this.b = lky3;
    }

    public final vq2<p23> a() {
        if (Build.VERSION.SDK_INT < 31) {
            return vq2.s(new p23(false));
        }
        lKy3 lky3 = this.b;
        lky3.getClass();
        return lky3.j(lky3.d(R.string.pref_audiofocus_strategy_key), null, new P1s(lky3)).B(new NFo7(this, 8));
    }
}
