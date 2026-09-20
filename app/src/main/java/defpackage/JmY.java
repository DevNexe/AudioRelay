package defpackage;

import android.media.projection.MediaProjection;

/* JADX INFO: loaded from: classes.dex */
public final class JmY extends MediaProjection.Callback {
    public final /* synthetic */ AO9A a;

    public JmY(AO9A ao9a) {
        this.a = ao9a;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public final void onStop() {
        AO9A ao9a = this.a;
        ao9a.getClass();
        a62.a.e("called_stop_from_media_projection");
        fp1.k0(ha1.w, rl0.c, 0, new WXuy(ao9a, null), 2);
    }
}
