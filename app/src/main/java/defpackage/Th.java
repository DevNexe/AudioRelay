package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.azefsw.audioconnect.R;
import io.ktor.utils.io.core.InsufficientSpaceException;
import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import kotlinx.datetime.DateTimeArithmeticException;

/* JADX INFO: loaded from: classes.dex */
public class Th implements ba, qf6 {
    public static sy4 X;
    public static ej1 w;
    public static final int[] x = {R.attr.layout_scrollFlags, R.attr.layout_scrollInterpolator};
    public static final int[] y = {android.R.attr.maxWidth, android.R.attr.elevation, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.behavior_expandedOffset, R.attr.behavior_fitToContents, R.attr.behavior_halfExpandedRatio, R.attr.behavior_hideable, R.attr.behavior_peekHeight, R.attr.behavior_saveFlags, R.attr.behavior_skipCollapsed, R.attr.gestureInsetBottomIgnored, R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets, R.attr.paddingTopSystemWindowInsets, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};
    public static final int[] z = {android.R.attr.textAppearance, android.R.attr.textSize, android.R.attr.textColor, android.R.attr.ellipsize, android.R.attr.maxWidth, android.R.attr.text, android.R.attr.checkable, R.attr.checkedIcon, R.attr.checkedIconEnabled, R.attr.checkedIconTint, R.attr.checkedIconVisible, R.attr.chipBackgroundColor, R.attr.chipCornerRadius, R.attr.chipEndPadding, R.attr.chipIcon, R.attr.chipIconEnabled, R.attr.chipIconSize, R.attr.chipIconTint, R.attr.chipIconVisible, R.attr.chipMinHeight, R.attr.chipMinTouchTargetSize, R.attr.chipStartPadding, R.attr.chipStrokeColor, R.attr.chipStrokeWidth, R.attr.chipSurfaceColor, R.attr.closeIcon, R.attr.closeIconEnabled, R.attr.closeIconEndPadding, R.attr.closeIconSize, R.attr.closeIconStartPadding, R.attr.closeIconTint, R.attr.closeIconVisible, R.attr.ensureMinTouchTargetSize, R.attr.hideMotionSpec, R.attr.iconEndPadding, R.attr.iconStartPadding, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.textEndPadding, R.attr.textStartPadding};
    public static final int[] A = {R.attr.checkedChip, R.attr.chipSpacing, R.attr.chipSpacingHorizontal, R.attr.chipSpacingVertical, R.attr.selectionRequired, R.attr.singleLine, R.attr.singleSelection};
    public static final int[] B = {R.attr.clockFaceBackgroundColor, R.attr.clockNumberTextColor};
    public static final int[] C = {R.attr.clockHandColor, R.attr.materialCircleRadius, R.attr.selectorSize};
    public static final int[] D = {R.attr.behavior_autoHide, R.attr.behavior_autoShrink};
    public static final int[] E = {R.attr.behavior_autoHide};
    public static final int[] F = {R.attr.itemSpacing, R.attr.lineSpacing};
    public static final int[] G = {android.R.attr.foreground, android.R.attr.foregroundGravity, R.attr.foregroundInsidePadding};
    public static final int[] H = {android.R.attr.background, android.R.attr.insetLeft, android.R.attr.insetRight, android.R.attr.insetTop, android.R.attr.insetBottom, android.R.attr.checkable, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.cornerRadius, R.attr.elevation, R.attr.icon, R.attr.iconGravity, R.attr.iconPadding, R.attr.iconSize, R.attr.iconTint, R.attr.iconTintMode, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.strokeColor, R.attr.strokeWidth};
    public static final int[] I = {R.attr.checkedButton, R.attr.selectionRequired, R.attr.singleSelection};
    public static final int[] J = {android.R.attr.windowFullscreen, R.attr.dayInvalidStyle, R.attr.daySelectedStyle, R.attr.dayStyle, R.attr.dayTodayStyle, R.attr.nestedScrollable, R.attr.rangeFillColor, R.attr.yearSelectedStyle, R.attr.yearStyle, R.attr.yearTodayStyle};
    public static final int[] K = {android.R.attr.insetLeft, android.R.attr.insetRight, android.R.attr.insetTop, android.R.attr.insetBottom, R.attr.itemFillColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemStrokeColor, R.attr.itemStrokeWidth, R.attr.itemTextColor};
    public static final int[] L = {R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};
    public static final int[] M = {android.R.attr.letterSpacing, android.R.attr.lineHeight, R.attr.lineHeight};
    public static final int[] N = {android.R.attr.textAppearance, android.R.attr.lineHeight, R.attr.lineHeight};
    public static final int[] O = {R.attr.navigationIconTint, R.attr.subtitleCentered, R.attr.titleCentered};
    public static final int[] P = {R.attr.materialCircleRadius};
    public static final int[] Q = {R.attr.behavior_overlapTop};
    public static final int[] R = {R.attr.cornerFamily, R.attr.cornerFamilyBottomLeft, R.attr.cornerFamilyBottomRight, R.attr.cornerFamilyTopLeft, R.attr.cornerFamilyTopRight, R.attr.cornerSize, R.attr.cornerSizeBottomLeft, R.attr.cornerSizeBottomRight, R.attr.cornerSizeTopLeft, R.attr.cornerSizeTopRight};
    public static final int[] S = {android.R.attr.maxWidth, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth};
    public static final int[] T = {android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.textColorLink, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, android.R.attr.textFontWeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] U = {R.attr.textInputLayoutFocusedRectEnabled};
    public static final int[] V = {android.R.attr.enabled, android.R.attr.textColorHint, android.R.attr.maxWidth, android.R.attr.minWidth, android.R.attr.hint, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMode, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};
    public static final int[] W = {android.R.attr.textAppearance, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};
    public static final /* synthetic */ Th Y = new Th();

    public static void A(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iP = P(parcel, i);
        parcel.writeBundle(bundle);
        X(parcel, iP);
    }

    public static void B(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iP = P(parcel, i);
        parcel.writeByteArray(bArr);
        X(parcel, iP);
    }

    public static final void C(fg fgVar, int i) {
        YKK.i(null, 1, null);
        throw null;
    }

    public static final void D(pw2 pw2Var, byte[] bArr, int i, int i2) {
        oq oqVarI = YKK.i(pw2Var, 1, null);
        while (true) {
            try {
                int iMin = Math.min(i2, oqVarI.e - oqVarI.c);
                int i3 = oqVarI.c;
                int i4 = oqVarI.e - i3;
                if (i4 < iMin) {
                    throw new InsufficientSpaceException("byte array", iMin, i4);
                }
                oc2.a(ByteBuffer.wrap(bArr, i, iMin).slice().order(ByteOrder.BIG_ENDIAN), oqVarI.a, 0, iMin, i3);
                oqVarI.a(iMin);
                i += iMin;
                i2 -= iMin;
                if (!(i2 > 0)) {
                    pw2Var.b();
                    return;
                }
                oqVarI = YKK.i(pw2Var, 1, oqVarI);
            } catch (Throwable th) {
                pw2Var.b();
                throw th;
            }
        }
    }

    public static /* synthetic */ void E(pw2 pw2Var, byte[] bArr) {
        D(pw2Var, bArr, 0, bArr.length - 0);
    }

    public static void F(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iP = P(parcel, i);
        parcel.writeStrongBinder(iBinder);
        X(parcel, iP);
    }

    public static void G(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(i2);
    }

    public static void H(Parcel parcel, int i, long j) {
        parcel.writeInt(i | 524288);
        parcel.writeLong(j);
    }

    public static void I(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iP = P(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        X(parcel, iP);
    }

    public static void J(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iP = P(parcel, i);
        parcel.writeString(str);
        X(parcel, iP);
    }

    public static void K(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iP = P(parcel, i);
        parcel.writeStringArray(strArr);
        X(parcel, iP);
    }

    public static void L(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iP = P(parcel, i);
        parcel.writeStringList(list);
        X(parcel, iP);
    }

    public static void M(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iP = P(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                a0(parcel, parcelable, i2);
            }
        }
        X(parcel, iP);
    }

    public static void N(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iP = P(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                a0(parcel, parcelable, 0);
            }
        }
        X(parcel, iP);
    }

    public static int O(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static int P(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static Object Q(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()));
    }

    public static ez5 R(by5 by5Var, f06 f06Var, ma5 ma5Var, ArrayList arrayList) {
        String str = f06Var.w;
        if (by5Var.a(str)) {
            ez5 ez5VarZzf = by5Var.zzf(str);
            if (ez5VarZzf instanceof uw5) {
                return ((uw5) ez5VarZzf).d(ma5Var, arrayList);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", str));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(String.format("Object has no function %s", str));
        }
        nw6.h("hasOwnProperty", 1, arrayList);
        return by5Var.a(ma5Var.b((ez5) arrayList.get(0)).zzi()) ? ez5.t : ez5.u;
    }

    public static void S(int i, int i2) {
        String strG;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strG = m57.g("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                strG = m57.g("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strG);
        }
    }

    public static /* synthetic */ boolean T(String str, Object obj) {
        return str == obj || (str != null && str.equals(obj));
    }

    public static int U(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static void V(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(Z(i, i2, "index"));
        }
    }

    public static void W(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static void X(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void Y(int i, int i2, int i3) {
        String strZ;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strZ = Z(i, i3, "start index");
            } else {
                strZ = (i2 < 0 || i2 > i3) ? Z(i2, i3, "end index") : m57.g("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strZ);
        }
    }

    public static String Z(int i, int i2, String str) {
        if (i < 0) {
            return m57.g("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return m57.g("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final void a(Throwable th, Throwable th2) {
        if (th != th2) {
            c53.a.a(th, th2);
        }
    }

    public static void a0(Parcel parcel, Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static final void b(av4 av4Var, yu4 yu4Var) {
        Iterator<T> it = yu4Var.a().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            av4Var.c((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static boolean b0(byte b) {
        return b > -65;
    }

    public static final void c(int i) {
        if (new pp1(2, 36).g(i)) {
            return;
        }
        StringBuilder sbC = iZUl.c("radix ", i, " was not in valid range ");
        sbC.append(new pp1(2, 36));
        throw new IllegalArgumentException(sbC.toString());
    }

    public static final void d(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                a(th, th2);
            }
        }
    }

    public static final void e(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        int iRemaining = byteBuffer2.remaining();
        if (byteBuffer.hasArray() && !byteBuffer.isReadOnly() && byteBuffer2.hasArray() && !byteBuffer2.isReadOnly()) {
            int iPosition = byteBuffer2.position();
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i, byteBuffer2.array(), byteBuffer2.arrayOffset() + iPosition, iRemaining);
            byteBuffer2.position(iPosition + iRemaining);
        } else {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.limit(iRemaining + i);
            byteBufferDuplicate.position(i);
            byteBuffer2.put(byteBufferDuplicate);
        }
    }

    public static final fz2 f(gz2 gz2Var) {
        hz2 hz2Var = new hz2(8);
        for (String str : gz2Var.names()) {
            List<String> listD = gz2Var.d(str);
            if (listD == null) {
                listD = cs0.w;
            }
            String strE = tt.e(str, 0, 0, false, 15);
            List<String> list = listD;
            ArrayList arrayList = new ArrayList(mu.w0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(tt.e((String) it.next(), 0, 0, true, 11));
            }
            hz2Var.c(strE, arrayList);
        }
        return new iz2(hz2Var.b);
    }

    public static final boolean g(char c, char c2, boolean z2) {
        if (c == c2) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final gx h(rx rxVar, final long j, final long j2, final long j3, final c54 c54Var) {
        i91 i91Var = new i91() { // from class: f14
            @Override // defpackage.i91
            public final Object apply(Object obj) {
                return Th.i(j, j2, j3, new wr2((a11) obj), c54Var).F(3);
            }
        };
        a11 a11VarD = rxVar instanceof n91 ? ((n91) rxVar).d() : new yx(rxVar);
        a11VarD.getClass();
        return new gx(new q11(a11VarD, i91Var));
    }

    public static final jr2 i(final long j, final long j2, final long j3, vq2 vq2Var, final c54 c54Var) {
        final il3 il3Var = new il3();
        il3Var.w = gq0.g(j);
        final jl3 jl3Var = new jl3();
        vq2 vq2VarN = vq2Var.n(new i91() { // from class: g14
            @Override // defpackage.i91
            public final Object apply(Object obj) {
                final long j4 = j2;
                final long j5 = j3;
                final long j6 = j;
                final jl3 jl3Var2 = jl3Var;
                vl0 vl0Var = (vl0) jl3Var2.w;
                if (vl0Var != null) {
                    vl0Var.a();
                }
                final il3 il3Var2 = il3Var;
                long j7 = il3Var2.w;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                final c54 c54Var2 = c54Var;
                return new cs2(new zs2(new jr2(vq2.E(j7, timeUnit, c54Var2), new m70() { // from class: i14
                    /* JADX WARN: Type inference failed for: r6v4, types: [T, vl0] */
                    @Override // defpackage.m70
                    public final void accept(Object obj2) {
                        final il3 il3Var3 = il3Var2;
                        long j8 = il3Var3.w * ((long) 2);
                        long jG = gq0.g(j4);
                        if (j8 > jG) {
                            j8 = jG;
                        }
                        il3Var3.w = j8;
                        final long j9 = j6;
                        jl3Var2.w = c54Var2.c(new Runnable() { // from class: b14
                            @Override // java.lang.Runnable
                            public final void run() {
                                il3Var3.w = gq0.g(j9);
                            }
                        }, gq0.g(j5), TimeUnit.MILLISECONDS);
                    }
                }, m91.d, m91.c)), new j14(0));
            }
        });
        l83 l83Var = new l83(jl3Var, 6);
        vq2VarN.getClass();
        return new jr2(vq2VarN, m91.d, new m91.QnHx(l83Var), l83Var);
    }

    public static final pp3 j(vu4 vu4Var, Object... objArr) {
        qu4.QnHx qnHx = qu4.a;
        return new pp3(vu4Var, Arrays.asList(Arrays.copyOf(objArr, objArr.length)));
    }

    public static final ej1 k() {
        ej1 ej1Var = w;
        if (ej1Var != null) {
            return ej1Var;
        }
        ej1.QnHx qnHx = new ej1.QnHx("Outlined.Help");
        int i = sg5.a;
        jq4 jq4Var = new jq4(yu.b);
        le3 le3Var = new le3();
        le3Var.i(12.0f, 2.0f);
        le3Var.c(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        le3Var.k(4.48f, 10.0f, 10.0f, 10.0f);
        le3Var.k(10.0f, -4.48f, 10.0f, -10.0f);
        le3Var.j(17.52f, 2.0f, 12.0f, 2.0f);
        le3Var.b();
        le3Var.i(13.0f, 19.0f);
        le3Var.f(-2.0f);
        le3Var.n(-2.0f);
        le3Var.f(2.0f);
        le3Var.n(2.0f);
        le3Var.b();
        le3Var.i(15.07f, 11.25f);
        le3Var.h(-0.9f, 0.92f);
        le3Var.c(13.45f, 12.9f, 13.0f, 13.5f, 13.0f, 15.0f);
        le3Var.f(-2.0f);
        le3Var.n(-0.5f);
        le3Var.d(0.0f, -1.1f, 0.45f, -2.1f, 1.17f, -2.83f);
        le3Var.h(1.24f, -1.26f);
        le3Var.d(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        le3Var.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        le3Var.k(-2.0f, 0.9f, -2.0f, 2.0f);
        le3Var.g(8.0f, 9.0f);
        le3Var.d(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        le3Var.k(4.0f, 1.79f, 4.0f, 4.0f);
        le3Var.d(0.0f, 0.88f, -0.36f, 1.68f, -0.93f, 2.25f);
        le3Var.b();
        qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
        ej1 ej1VarD = qnHx.d();
        w = ej1VarD;
        return ej1VarD;
    }

    public static TextView l(Toolbar toolbar, CharSequence charSequence) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    public static void m(File file, InputStream inputStream) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[8192];
        try {
            gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        gZIPOutputStream.finish();
                        try {
                            gZIPOutputStream.close();
                            return;
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    gZIPOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    th = th;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (RuntimeException e2) {
                            throw e2;
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream = null;
        }
    }

    public static final boolean n(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static String o(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final long p(s42 s42Var, s42 s42Var2) {
        x75.Companion.getClass();
        Instant instant = s42Var.w.A(x75.QnHx.a(ZoneId.systemDefault()).a).toInstant();
        Instant instant2 = s42Var2.w.A(x75.QnHx.a(ZoneId.systemDefault()).a).toInstant();
        gq0.QnHx qnHx = gq0.x;
        return gq0.o(ps0.p0(instant.getEpochSecond() - instant2.getEpochSecond(), kq0.SECONDS), ps0.o0(instant.getNano() - instant2.getNano(), kq0.NANOSECONDS));
    }

    public static final s42 q() {
        ep1.Companion.getClass();
        Instant instant = Clock.systemUTC().instant();
        x75.Companion.getClass();
        try {
            return new s42(LocalDateTime.ofInstant(instant, x75.QnHx.a(ZoneId.systemDefault()).a));
        } catch (DateTimeException e) {
            throw new DateTimeArithmeticException(e);
        }
    }

    public static final void r(fg fgVar, ByteBuffer byteBuffer, int i) throws EOFException {
        ByteBuffer byteBuffer2 = fgVar.a;
        int i2 = fgVar.b;
        if (fgVar.c - i2 < i) {
            throw new EOFException("Not enough bytes to read a buffer content of size " + i + '.');
        }
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i);
            e(byteBuffer2, byteBuffer, i2);
            byteBuffer.limit(iLimit);
            sd5 sd5Var = sd5.a;
            fgVar.c(i);
        } catch (Throwable th) {
            byteBuffer.limit(iLimit);
            throw th;
        }
    }

    public static final lt s(p61.CQf cQf) throws EOFException {
        short s;
        if (cQf.c.length < 2) {
            return null;
        }
        ek ekVar = new ek(null);
        try {
            E(ekVar, cQf.c);
            hk hkVarS = ekVar.s();
            int i = hkVarS.A;
            int i2 = hkVarS.z;
            if (i - i2 > 2) {
                hkVarS.z = i2 + 2;
                s = hkVarS.y.getShort(i2);
            } else {
                oq oqVarG = YKK.g(hkVarS, 2);
                if (oqVarG == null) {
                    ac.g(2);
                    throw null;
                }
                int i3 = oqVarG.b;
                if (oqVarG.c - i3 < 2) {
                    throw new EOFException("Not enough bytes to read a short integer of size 2.");
                }
                Short shValueOf = Short.valueOf(oqVarG.a.getShort(i3));
                oqVarG.c(2);
                short sShortValue = shValueOf.shortValue();
                YKK.b(hkVarS, oqVarG);
                s = sShortValue;
            }
            return new lt(s, qn1.s(hkVarS));
        } catch (Throwable th) {
            ekVar.close();
            throw th;
        }
    }

    public static final long t(long j, kq0 kq0Var) {
        List list;
        kq0[] kq0VarArrValues = kq0.values();
        if (kq0VarArrValues.length == 0) {
            list = cs0.w;
        } else {
            ArrayList arrayList = new ArrayList(new hello(kq0VarArrValues, false));
            Collections.reverse(arrayList);
            list = arrayList;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kq0 kq0Var2 = (kq0) list.get(i);
            long jP = gq0.p(j, kq0Var2);
            if (jP > 0) {
                return ps0.p0(jP, kq0Var2);
            }
            if (kq0Var2 == kq0Var) {
                break;
            }
        }
        return ps0.p0(gq0.p(j, kq0Var), kq0Var);
    }

    public static final Set u(Object... objArr) {
        int length;
        int length2 = objArr.length;
        hs0 hs0Var = hs0.w;
        if (length2 <= 0 || (length = objArr.length) == 0) {
            return hs0Var;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C0239D.A(objArr.length));
        oV9.i0(linkedHashSet, objArr);
        return linkedHashSet;
    }

    public static final ByteBuffer v(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.limit(i + i2);
        return byteBufferDuplicate.slice();
    }

    public static final String w(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static final String x(char c, Locale locale) {
        String upperCase = String.valueOf(c).toUpperCase(locale);
        if (upperCase.length() <= 1) {
            return !ur1.a(upperCase, String.valueOf(c).toUpperCase(Locale.ROOT)) ? upperCase : String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        return upperCase.charAt(0) + upperCase.substring(1).toLowerCase(Locale.ROOT);
    }

    public static final char[] y(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
        }
        return cArr;
    }

    public static void z(Parcel parcel, int i, boolean z2) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(z2 ? 1 : 0);
    }

    @Override // defpackage.ba
    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(((vf) obj).a((ou3) obj2));
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Long.valueOf(b67.x.zza().zzt());
    }
}
