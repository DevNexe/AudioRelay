package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = versionedParcel.o(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = versionedParcel.o(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = versionedParcel.o(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = versionedParcel.o(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.I(audioAttributesImplBase.a, 1);
        versionedParcel.I(audioAttributesImplBase.b, 2);
        versionedParcel.I(audioAttributesImplBase.c, 3);
        versionedParcel.I(audioAttributesImplBase.d, 4);
    }
}
