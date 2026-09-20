package androidx.media2.session;

import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaParcelUtils;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.ParcelImpl;
import androidx.versionedparcelable.VersionedParcel;
import defpackage.jz2;
import defpackage.nc2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LibraryResultParcelizer {
    public static LibraryResult read(VersionedParcel versionedParcel) {
        ArrayList arrayList;
        LibraryResult libraryResult = new LibraryResult();
        libraryResult.a = versionedParcel.o(libraryResult.a, 1);
        libraryResult.b = versionedParcel.q(2, libraryResult.b);
        libraryResult.d = (MediaItem) versionedParcel.x(libraryResult.d, 3);
        libraryResult.e = (MediaLibraryService$LibraryParams) versionedParcel.x(libraryResult.e, 4);
        ParcelImplListSlice parcelImplListSlice = (ParcelImplListSlice) versionedParcel.s(libraryResult.g, 5);
        libraryResult.g = parcelImplListSlice;
        libraryResult.c = libraryResult.d;
        HashMap map = nc2.a;
        if (parcelImplListSlice == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (true) {
                List<ParcelImpl> list = parcelImplListSlice.w;
                if (i >= list.size()) {
                    break;
                }
                ParcelImpl parcelImpl = list.get(i);
                if (parcelImpl != null) {
                    arrayList2.add((MediaItem) jz2.a(parcelImpl));
                }
                i++;
            }
            arrayList = arrayList2;
        }
        libraryResult.f = arrayList;
        return libraryResult;
    }

    public static void write(LibraryResult libraryResult, VersionedParcel versionedParcel) {
        ParcelImplListSlice parcelImplListSlice;
        versionedParcel.getClass();
        MediaItem mediaItem = libraryResult.c;
        if (mediaItem != null) {
            synchronized (mediaItem) {
                if (libraryResult.d == null) {
                    libraryResult.d = nc2.a(libraryResult.c);
                }
            }
        }
        ArrayList arrayList = libraryResult.f;
        if (arrayList != null) {
            synchronized (arrayList) {
                if (libraryResult.g == null) {
                    ArrayList arrayList2 = libraryResult.f;
                    HashMap map = nc2.a;
                    if (arrayList2 == null) {
                        parcelImplListSlice = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i = 0; i < arrayList2.size(); i++) {
                            MediaItem mediaItem2 = (MediaItem) arrayList2.get(i);
                            if (mediaItem2 != null) {
                                arrayList3.add(MediaParcelUtils.a(mediaItem2));
                            }
                        }
                        parcelImplListSlice = new ParcelImplListSlice(arrayList3);
                    }
                    libraryResult.g = parcelImplListSlice;
                }
            }
        }
        versionedParcel.I(libraryResult.a, 1);
        versionedParcel.J(2, libraryResult.b);
        versionedParcel.R(libraryResult.d, 3);
        versionedParcel.R(libraryResult.e, 4);
        versionedParcel.M(libraryResult.g, 5);
    }
}
