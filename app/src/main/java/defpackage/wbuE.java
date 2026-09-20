package defpackage;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wbuE {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        new int[Paint.Style.values().length][Paint.Style.STROKE.ordinal()] = 1;
        int[] iArr = new int[Paint.Cap.values().length];
        iArr[Paint.Cap.BUTT.ordinal()] = 1;
        iArr[Paint.Cap.ROUND.ordinal()] = 2;
        iArr[Paint.Cap.SQUARE.ordinal()] = 3;
        a = iArr;
        int[] iArr2 = new int[Paint.Join.values().length];
        iArr2[Paint.Join.MITER.ordinal()] = 1;
        iArr2[Paint.Join.BEVEL.ordinal()] = 2;
        iArr2[Paint.Join.ROUND.ordinal()] = 3;
        b = iArr2;
    }
}
