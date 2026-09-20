package androidx.media2.common;

import android.annotation.SuppressLint;
import androidx.versionedparcelable.ParcelImpl;
import defpackage.sh5;

/* JADX INFO: loaded from: classes.dex */
public final class MediaParcelUtils {

    @SuppressLint({"RestrictedApi"})
    public static class MediaItemParcelImpl extends ParcelImpl {
        public final MediaItem x;

        public MediaItemParcelImpl(MediaItem mediaItem) {
            super(new MediaItem(mediaItem.b, mediaItem.c, mediaItem.d));
            this.x = mediaItem;
        }

        @Override // androidx.versionedparcelable.ParcelImpl
        public final sh5 a() {
            return this.x;
        }
    }

    public static ParcelImpl a(sh5 sh5Var) {
        return sh5Var instanceof MediaItem ? new MediaItemParcelImpl((MediaItem) sh5Var) : new ParcelImpl(sh5Var);
    }
}
