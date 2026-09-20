package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;

/* JADX INFO: loaded from: classes.dex */
public final class qh extends cx1 implements j81<com9Fixed, sd5> {
    public final /* synthetic */ Context w;
    public final /* synthetic */ j81<MediaProjection, sd5> x;
    public final /* synthetic */ j81<com9Fixed, sd5> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(Context context, j81 j81Var, f_5.LPt8Fixed lPt8) {
        super(1);
        this.w = context;
        this.x = j81Var;
        this.y = lPt8;
    }

    @Override // defpackage.j81
    public final sd5 invoke(com9Fixed com9Var) {
        com9Fixed com9Var2 = com9Var;
        Object objC = r80.c(this.w.getApplicationContext(), MediaProjectionManager.class);
        if (objC == null) {
            throw new IllegalStateException("MediaProjectionManager not found".toString());
        }
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) objC;
        Intent intent = com9Var2.x;
        if (intent == null) {
            intent = new Intent();
        }
        MediaProjection mediaProjection = mediaProjectionManager.getMediaProjection(com9Var2.w, intent);
        if (mediaProjection != null) {
            this.x.invoke(mediaProjection);
        } else {
            this.y.invoke(com9Var2);
        }
        return sd5.a;
    }
}
