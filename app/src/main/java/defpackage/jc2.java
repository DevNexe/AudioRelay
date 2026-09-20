package defpackage;

import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class jc2 {
    public final lc2 a;

    public jc2(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new kc2(str, i, i2);
        } else {
            this.a = new lc2(str, i, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc2)) {
            return false;
        }
        return this.a.equals(((jc2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public jc2(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        String packageName = mediaSessionManager$RemoteUserInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                this.a = new kc2(mediaSessionManager$RemoteUserInfo);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }
}
