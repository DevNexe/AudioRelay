package defpackage;

import android.media.session.MediaSessionManager$RemoteUserInfo;

/* JADX INFO: loaded from: classes.dex */
public final class kc2 extends lc2 {
    public kc2(String str, int i, int i2) {
        super(str, i, i2);
        new MediaSessionManager$RemoteUserInfo(str, i, i2);
    }

    public kc2(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        super(mediaSessionManager$RemoteUserInfo.getPackageName(), mediaSessionManager$RemoteUserInfo.getPid(), mediaSessionManager$RemoteUserInfo.getUid());
    }
}
