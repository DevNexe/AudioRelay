package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class VD extends HT {
    public static String[] A01 = {"26JblF4b6dorFS8jU2vwriUxZ0G71mwq", "Xnpi2o2sUEOze", "R71e3dTOAhzB09tZHggtqRTS0V3by", "x11tshWAsx1g8", "baPvwG8wSWpB2aFi4", "NgcUJ4cAOsbj9", "II", "FdNrM275eXYBmZtzCUl1db95x7ONP"};

    @Nullable
    public HO A00;

    public abstract Pair<C0504Av[], HQ[]> A0V(HO ho, int[][][] iArr, int[] iArr2) throws AM;

    public static int A0Q(InterfaceC0503Au[] interfaceC0503AuArr, TrackGroup trackGroup) throws AM {
        int rendererIndex = interfaceC0503AuArr.length;
        int i = 0;
        for (int trackIndex = 0; trackIndex < interfaceC0503AuArr.length; trackIndex++) {
            InterfaceC0503Au interfaceC0503Au = interfaceC0503AuArr[trackIndex];
            for (int i2 = 0; i2 < trackGroup.A01; i2++) {
                int formatSupportLevel = interfaceC0503Au.AF7(trackGroup.A01(i2)) & 7;
                if (formatSupportLevel > i) {
                    rendererIndex = trackIndex;
                    i = formatSupportLevel;
                    if (i == 4) {
                        return rendererIndex;
                    }
                }
            }
        }
        return rendererIndex;
    }

    public static int[] A0R(InterfaceC0503Au interfaceC0503Au, TrackGroup trackGroup) throws AM {
        int[] iArr = new int[trackGroup.A01];
        for (int i = 0; i < trackGroup.A01; i++) {
            iArr[i] = interfaceC0503Au.AF7(trackGroup.A01(i));
        }
        return iArr;
    }

    public static int[] A0S(InterfaceC0503Au[] interfaceC0503AuArr) throws AM {
        int[] iArr = new int[interfaceC0503AuArr.length];
        int i = 0;
        while (true) {
            int length = iArr.length;
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[5];
            int length2 = str.length();
            int i2 = str2.length();
            if (length2 == i2) {
                throw new RuntimeException();
            }
            A01[0] = "xB4ZDOqJN2K9OUw5kZCJNg4ll7dteaQM";
            if (i < length) {
                int i3 = interfaceC0503AuArr[i].AF9();
                iArr[i] = i3;
                i++;
            } else {
                return iArr;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final HU A0T(InterfaceC0503Au[] interfaceC0503AuArr, TrackGroupArray trackGroupArray) throws AM {
        int[] iArrA0R;
        int[] iArr = new int[interfaceC0503AuArr.length + 1];
        TrackGroup[][] trackGroupArr = new TrackGroup[interfaceC0503AuArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC0503AuArr.length + 1][][];
        for (int i = 0; i < i; i++) {
            int i2 = trackGroupArray.A01;
            trackGroupArr[i] = new TrackGroup[i2];
            int i3 = trackGroupArray.A01;
            iArr2[i] = new int[i3][];
        }
        int[] iArrA0S = A0S(interfaceC0503AuArr);
        for (int i4 = 0; i4 < groupIndex; i4++) {
            TrackGroup trackGroupA01 = trackGroupArray.A01(i4);
            int iA0Q = A0Q(interfaceC0503AuArr, trackGroupA01);
            if (iA0Q == interfaceC0503AuArr.length) {
                iArrA0R = new int[trackGroupA01.A01];
            } else {
                iArrA0R = A0R(interfaceC0503AuArr[iA0Q], trackGroupA01);
            }
            int i5 = iArr[iA0Q];
            trackGroupArr[iA0Q][i5] = trackGroupA01;
            iArr2[iA0Q][i5] = iArrA0R;
            int rendererTrackGroupCount = iArr[iA0Q];
            iArr[iA0Q] = rendererTrackGroupCount + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[interfaceC0503AuArr.length];
        int[] iArr3 = new int[interfaceC0503AuArr.length];
        for (int i6 = 0; i6 < i; i6++) {
            int i7 = iArr[i6];
            trackGroupArrayArr[i6] = new TrackGroupArray((TrackGroup[]) C0695Iz.A0k(trackGroupArr[i6], i7));
            iArr2[i6] = (int[][]) C0695Iz.A0k(iArr2[i6], i7);
            int rendererTrackGroupCount2 = interfaceC0503AuArr[i6].A7i();
            iArr3[i6] = rendererTrackGroupCount2;
        }
        int unmappedTrackGroupCount = iArr[interfaceC0503AuArr.length];
        HO ho = new HO(iArr3, trackGroupArrayArr, iArrA0S, iArr2, new TrackGroupArray((TrackGroup[]) C0695Iz.A0k(trackGroupArr[interfaceC0503AuArr.length], unmappedTrackGroupCount)));
        Pair<C0504Av[], HQ[]> pairA0V = A0V(ho, iArr2, iArrA0S);
        return new HU((C0504Av[]) pairA0V.first, (HQ[]) pairA0V.second, ho);
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final void A0U(Object obj) {
        this.A00 = (HO) obj;
    }
}
