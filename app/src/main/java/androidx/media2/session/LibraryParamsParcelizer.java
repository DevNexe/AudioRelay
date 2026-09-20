package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class LibraryParamsParcelizer {
    public static MediaLibraryService$LibraryParams read(VersionedParcel versionedParcel) {
        MediaLibraryService$LibraryParams mediaLibraryService$LibraryParams = new MediaLibraryService$LibraryParams();
        mediaLibraryService$LibraryParams.a = versionedParcel.h(1, mediaLibraryService$LibraryParams.a);
        mediaLibraryService$LibraryParams.b = versionedParcel.o(mediaLibraryService$LibraryParams.b, 2);
        mediaLibraryService$LibraryParams.c = versionedParcel.o(mediaLibraryService$LibraryParams.c, 3);
        mediaLibraryService$LibraryParams.d = versionedParcel.o(mediaLibraryService$LibraryParams.d, 4);
        return mediaLibraryService$LibraryParams;
    }

    public static void write(MediaLibraryService$LibraryParams mediaLibraryService$LibraryParams, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.B(1, mediaLibraryService$LibraryParams.a);
        versionedParcel.I(mediaLibraryService$LibraryParams.b, 2);
        versionedParcel.I(mediaLibraryService$LibraryParams.c, 3);
        versionedParcel.I(mediaLibraryService$LibraryParams.d, 4);
    }
}
