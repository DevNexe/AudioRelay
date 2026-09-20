package defpackage;

import android.content.ClipDescription;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.compose.ui.platform.AndroidComposeView;
import com.azefsw.audioconnect.R;
import com.google.android.gms.ads.AdRequest;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class Z5 extends d_OZ {
    public static final int[] z = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public final AndroidComposeView d;
    public int e = Integer.MIN_VALUE;
    public final AccessibilityManager f;
    public final Handler g;
    public final ZJ h;
    public int i;
    public final wq4<wq4<CharSequence>> j;
    public final wq4<Map<CharSequence, Integer>> k;
    public int l;
    public Integer m;
    public final Q6g<yy1> n;
    public final defpackage.NUlFixed o;
    public boolean p;
    public NUlFixed q;
    public Map<Integer, g94> r;
    public final Q6g<Integer> s;
    public final LinkedHashMap t;
    public YKK u;
    public boolean v;
    public final u85 w;
    public final ArrayList x;
    public final T23 y;

    public static final class CQf {
        public static final void a(UT ut, f94 f94Var) {
            if (Cz.c(f94Var)) {
                FA4 fa4 = (FA4) y84.a(f94Var.e, w84.f);
                if (fa4 != null) {
                    ut.b(new UT.QnHx(android.R.id.accessibilityActionSetProgress, fa4.a));
                }
            }
        }
    }

    public static final class EQ extends cx1 implements j81<yy1, Boolean> {
        public static final EQ w = new EQ();

        public EQ() {
            super(1);
        }

        @Override // defpackage.j81
        public final Boolean invoke(yy1 yy1Var) {
            return Boolean.valueOf(fp1.Z(yy1Var) != null);
        }
    }

    public static final class F1 {
        public static final void a(AccessibilityEvent accessibilityEvent, int i, int i2) {
            accessibilityEvent.setScrollDeltaX(i);
            accessibilityEvent.setScrollDeltaY(i2);
        }
    }

    public final class LPt8Fixed extends AccessibilityNodeProvider {
        public LPt8Fixed() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            f94 f94Var;
            String str2;
            RectF rectF;
            Z5 z5 = Z5.this;
            g94 g94Var = z5.p().get(Integer.valueOf(i));
            if (g94Var == null || (f94Var = g94Var.a) == null) {
                return;
            }
            String strQ = Z5.q(f94Var);
            n94<FA4<j81<List<o55>, Boolean>>> n94Var = w84.a;
            x84 x84Var = f94Var.e;
            if (!x84Var.b(n94Var) || bundle == null || !ur1.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                n94<String> n94Var2 = i94.r;
                if (!x84Var.b(n94Var2) || bundle == null || !ur1.a(str, "androidx.compose.ui.semantics.testTag") || (str2 = (String) y84.a(x84Var, n94Var2)) == null) {
                    return;
                }
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (strQ != null ? strQ.length() : Integer.MAX_VALUE)) {
                    ArrayList arrayList = new ArrayList();
                    j81 j81Var = (j81) ((FA4) x84Var.c(n94Var)).b;
                    boolean z = false;
                    if (ur1.a(j81Var != null ? (Boolean) j81Var.invoke(arrayList) : null, Boolean.TRUE)) {
                        o55 o55Var = (o55) arrayList.get(0);
                        ArrayList arrayList2 = new ArrayList();
                        int i4 = 0;
                        while (i4 < i3) {
                            int i5 = i2 + i4;
                            if (i5 >= o55Var.a.a.length()) {
                                arrayList2.add(z);
                            } else {
                                dl3 dl3VarE = o55Var.b(i5).e(!f94Var.g.E() ? kt2.b : ps0.b0(f94Var.c()));
                                dl3 dl3VarD = f94Var.d();
                                dl3 dl3Var = dl3VarE.c(dl3VarD) ? new dl3(Math.max(dl3VarE.a, dl3VarD.a), Math.max(dl3VarE.b, dl3VarD.b), Math.min(dl3VarE.c, dl3VarD.c), Math.min(dl3VarE.d, dl3VarD.d)) : null;
                                if (dl3Var != null) {
                                    long jA = X.a(dl3Var.a, dl3Var.b);
                                    AndroidComposeView androidComposeView = z5.d;
                                    long jL = androidComposeView.l(jA);
                                    long jL2 = androidComposeView.l(X.a(dl3Var.c, dl3Var.d));
                                    rectF = new RectF(kt2.c(jL), kt2.d(jL), kt2.c(jL2), kt2.d(jL2));
                                } else {
                                    rectF = null;
                                }
                                arrayList2.add(rectF);
                            }
                            i4++;
                            z = false;
                        }
                        Bundle extras = accessibilityNodeInfo.getExtras();
                        Object[] array = arrayList2.toArray(new RectF[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        extras.putParcelableArray(str, (Parcelable[]) array);
                        return;
                    }
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
        }

        /* JADX WARN: Code duplicated, block: B:240:0x0438  */
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            AccessibilityNodeInfo accessibilityNodeInfo;
            int i2;
            kz1 kz1VarC;
            AccessibilityNodeInfo accessibilityNodeInfo2;
            int i3;
            int size;
            boolean zBooleanValue;
            Z7jl z7jl;
            String str;
            d32 d32Var;
            androidx.lifecycle.YKK ykkC;
            Z5 z5 = Z5.this;
            AndroidComposeView androidComposeView = z5.d;
            AndroidComposeView.CQf viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (((viewTreeOwners == null || (d32Var = viewTreeOwners.a) == null || (ykkC = d32Var.c()) == null) ? null : ykkC.b()) != androidx.lifecycle.YKK.F1.DESTROYED) {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                UT ut = new UT(accessibilityNodeInfoObtain);
                g94 g94Var = z5.p().get(Integer.valueOf(i));
                if (g94Var != null) {
                    f94 f94Var = g94Var.a;
                    if (i == -1) {
                        Field field = bi5.a;
                        Object objF = bi5.LPt8Fixed.f(androidComposeView);
                        View view = objF instanceof View ? (View) objF : null;
                        ut.b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        if (f94Var.g() == null) {
                            throw new IllegalStateException(ex0.b("semanticsNode ", i, " has null parent"));
                        }
                        f94 f94VarG = f94Var.g();
                        f94 f94VarA = androidComposeView.getSemanticsOwner().a();
                        int i4 = f94VarG.f;
                        int i5 = i4 != f94VarA.f ? i4 : -1;
                        ut.b = i5;
                        accessibilityNodeInfoObtain.setParent(androidComposeView, i5);
                    }
                    ut.c = i;
                    accessibilityNodeInfoObtain.setSource(androidComposeView, i);
                    Rect rect = g94Var.b;
                    long jL = androidComposeView.l(X.a(rect.left, rect.top));
                    long jL2 = androidComposeView.l(X.a(rect.right, rect.bottom));
                    accessibilityNodeInfoObtain.setBoundsInScreen(new Rect((int) Math.floor(kt2.c(jL)), (int) Math.floor(kt2.d(jL)), (int) Math.ceil(kt2.c(jL2)), (int) Math.ceil(kt2.d(jL2))));
                    ut.i("android.view.View");
                    n94<zs3> n94Var = i94.q;
                    x84 x84Var = f94Var.e;
                    zs3 zs3Var = (zs3) y84.a(x84Var, n94Var);
                    yy1 yy1Var = f94Var.g;
                    if (zs3Var != null) {
                        if (f94Var.c || f94Var.e(false).isEmpty()) {
                            int i6 = zs3Var.a;
                            if (i6 == 4) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", androidComposeView.getContext().getResources().getString(R.string.tab));
                            } else {
                                if (i6 == 0) {
                                    str = "android.widget.Button";
                                } else if (i6 == 1) {
                                    str = "android.widget.CheckBox";
                                } else if (i6 == 2) {
                                    str = "android.widget.Switch";
                                } else {
                                    str = i6 == 3 ? "android.widget.RadioButton" : i6 == 5 ? "android.widget.ImageView" : null;
                                }
                                if (!(i6 == 5) || Cz.m(yy1Var, OXy.w) == null || x84Var.x) {
                                    ut.i(str);
                                }
                            }
                        }
                        sd5 sd5Var = sd5.a;
                    }
                    if (Cz.x(f94Var)) {
                        ut.i("android.widget.EditText");
                    }
                    if (f94Var.f().b(i94.s)) {
                        ut.i("android.widget.TextView");
                    }
                    accessibilityNodeInfoObtain.setPackageName(androidComposeView.getContext().getPackageName());
                    List listE = f94Var.e(true);
                    int size2 = listE.size();
                    int i7 = 0;
                    while (true) {
                        accessibilityNodeInfo = ut.a;
                        if (i7 >= size2) {
                            break;
                        }
                        f94 f94Var2 = (f94) listE.get(i7);
                        if (z5.p().containsKey(Integer.valueOf(f94Var2.f))) {
                            X05 x05 = androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(f94Var2.g);
                            if (x05 != null) {
                                accessibilityNodeInfoObtain.addChild(x05);
                            } else {
                                accessibilityNodeInfo.addChild(androidComposeView, f94Var2.f);
                            }
                        }
                        i7++;
                    }
                    if (z5.i == i) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        ut.b(UT.QnHx.g);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        ut.b(UT.QnHx.f);
                    }
                    androidComposeView.getFontFamilyResolver();
                    Z7jl z7jlR = Z5.r(x84Var);
                    SpannableString spannableString = (SpannableString) Z5.H(z7jlR != null ? ps0.l0(z7jlR, androidComposeView.getDensity()) : null);
                    List list = (List) y84.a(x84Var, i94.s);
                    SpannableString spannableString2 = (SpannableString) Z5.H((list == null || (z7jl = (Z7jl) wu.J0(list)) == null) ? null : ps0.l0(z7jl, androidComposeView.getDensity()));
                    if (spannableString == null) {
                        spannableString = spannableString2;
                    }
                    ut.o(spannableString);
                    n94<String> n94Var2 = i94.z;
                    if (x84Var.b(n94Var2)) {
                        accessibilityNodeInfoObtain.setContentInvalid(true);
                        accessibilityNodeInfo.setError((CharSequence) y84.a(x84Var, n94Var2));
                    }
                    ut.n((CharSequence) y84.a(x84Var, i94.b));
                    q85 q85Var = (q85) y84.a(x84Var, i94.x);
                    if (q85Var != null) {
                        accessibilityNodeInfo.setCheckable(true);
                        int iOrdinal = q85Var.ordinal();
                        if (iOrdinal == 0) {
                            accessibilityNodeInfo.setChecked(true);
                            if ((zs3Var != null && zs3Var.a == 2) && ut.f() == null) {
                                ut.n(androidComposeView.getContext().getResources().getString(R.string.on));
                            }
                        } else if (iOrdinal == 1) {
                            accessibilityNodeInfo.setChecked(false);
                            if ((zs3Var != null && zs3Var.a == 2) && ut.f() == null) {
                                ut.n(androidComposeView.getContext().getResources().getString(R.string.off));
                            }
                        } else if (iOrdinal == 2 && ut.f() == null) {
                            ut.n(androidComposeView.getContext().getResources().getString(R.string.indeterminate));
                        }
                        sd5 sd5Var2 = sd5.a;
                    }
                    Boolean bool = (Boolean) y84.a(x84Var, i94.w);
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        if (zs3Var != null && zs3Var.a == 4) {
                            accessibilityNodeInfoObtain.setSelected(zBooleanValue2);
                        } else {
                            accessibilityNodeInfo.setCheckable(true);
                            accessibilityNodeInfo.setChecked(zBooleanValue2);
                            if (ut.f() == null) {
                                ut.n(zBooleanValue2 ? androidComposeView.getContext().getResources().getString(R.string.selected) : androidComposeView.getContext().getResources().getString(R.string.not_selected));
                            }
                        }
                        sd5 sd5Var3 = sd5.a;
                    }
                    if (!x84Var.x || f94Var.e(false).isEmpty()) {
                        List list2 = (List) y84.a(x84Var, i94.a);
                        accessibilityNodeInfo.setContentDescription(list2 != null ? (String) wu.J0(list2) : null);
                    }
                    if (x84Var.x) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo.setScreenReaderFocusable(true);
                        } else {
                            ut.h(1, true);
                        }
                    }
                    String str2 = (String) y84.a(x84Var, i94.r);
                    if (str2 != null) {
                        f94 f94VarG2 = f94Var;
                        while (true) {
                            if (f94VarG2 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            n94<Boolean> n94Var3 = j94.a;
                            x84 x84Var2 = f94VarG2.e;
                            if (x84Var2.b(n94Var3)) {
                                zBooleanValue = ((Boolean) x84Var2.c(n94Var3)).booleanValue();
                                break;
                            }
                            f94VarG2 = f94VarG2.g();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfoObtain.setViewIdResourceName(str2);
                        }
                    }
                    if (((sd5) y84.a(x84Var, i94.h)) != null) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo.setHeading(true);
                        } else {
                            ut.h(2, true);
                        }
                        sd5 sd5Var4 = sd5.a;
                    }
                    accessibilityNodeInfoObtain.setPassword(f94Var.f().b(i94.y));
                    accessibilityNodeInfoObtain.setEditable(Cz.x(f94Var));
                    accessibilityNodeInfo.setEnabled(Cz.c(f94Var));
                    n94<Boolean> n94Var4 = i94.k;
                    accessibilityNodeInfo.setFocusable(x84Var.b(n94Var4));
                    if (accessibilityNodeInfo.isFocusable()) {
                        accessibilityNodeInfo.setFocused(((Boolean) x84Var.c(n94Var4)).booleanValue());
                        if (accessibilityNodeInfo.isFocused()) {
                            i2 = 2;
                            ut.a(2);
                        } else {
                            i2 = 2;
                            ut.a(1);
                        }
                    } else {
                        i2 = 2;
                    }
                    if (f94Var.c) {
                        f94 f94VarG3 = f94Var.g();
                        kz1VarC = f94VarG3 != null ? f94VarG3.c() : null;
                    } else {
                        kz1VarC = f94Var.c();
                    }
                    accessibilityNodeInfo.setVisibleToUser(!(kz1VarC != null ? kz1VarC.T0() : false) && y84.a(x84Var, i94.l) == null);
                    l42 l42Var = (l42) y84.a(x84Var, i94.j);
                    if (l42Var != null) {
                        int i8 = l42Var.a;
                        if (i8 == 0) {
                            i2 = 1;
                        } else if (!(i8 == 1)) {
                            i2 = 1;
                        }
                        accessibilityNodeInfoObtain.setLiveRegion(i2);
                        sd5 sd5Var5 = sd5.a;
                    }
                    accessibilityNodeInfo.setClickable(false);
                    FA4 fa4 = (FA4) y84.a(x84Var, w84.b);
                    if (fa4 != null) {
                        boolean zA = ur1.a(y84.a(x84Var, i94.w), Boolean.TRUE);
                        accessibilityNodeInfo.setClickable(!zA);
                        if (Cz.c(f94Var) && !zA) {
                            ut.b(new UT.QnHx(16, fa4.a));
                        }
                        sd5 sd5Var6 = sd5.a;
                    }
                    accessibilityNodeInfo.setLongClickable(false);
                    FA4 fa5 = (FA4) y84.a(x84Var, w84.c);
                    if (fa5 != null) {
                        accessibilityNodeInfo.setLongClickable(true);
                        if (Cz.c(f94Var)) {
                            ut.b(new UT.QnHx(32, fa5.a));
                        }
                        sd5 sd5Var7 = sd5.a;
                    }
                    FA4 fa6 = (FA4) y84.a(x84Var, w84.i);
                    if (fa6 != null) {
                        ut.b(new UT.QnHx(16384, fa6.a));
                        sd5 sd5Var8 = sd5.a;
                    }
                    if (Cz.c(f94Var)) {
                        FA4 fa7 = (FA4) y84.a(x84Var, w84.h);
                        if (fa7 != null) {
                            ut.b(new UT.QnHx(2097152, fa7.a));
                            sd5 sd5Var9 = sd5.a;
                        }
                        FA4 fa8 = (FA4) y84.a(x84Var, w84.j);
                        if (fa8 != null) {
                            ut.b(new UT.QnHx(65536, fa8.a));
                            sd5 sd5Var10 = sd5.a;
                        }
                        FA4 fa9 = (FA4) y84.a(x84Var, w84.k);
                        if (fa9 != null) {
                            if (accessibilityNodeInfo.isFocused()) {
                                ClipDescription primaryClipDescription = androidComposeView.getClipboardManager().a.getPrimaryClipDescription();
                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/plain") : false) {
                                    ut.b(new UT.QnHx(32768, fa9.a));
                                }
                            }
                            sd5 sd5Var11 = sd5.a;
                        }
                    }
                    String strQ = Z5.q(f94Var);
                    boolean z = strQ == null || strQ.length() == 0;
                    x84 x84Var3 = f94Var.e;
                    if (!z) {
                        accessibilityNodeInfoObtain.setTextSelection(z5.o(f94Var), z5.n(f94Var));
                        FA4 fa10 = (FA4) y84.a(x84Var, w84.g);
                        ut.b(new UT.QnHx(131072, fa10 != null ? fa10.a : null));
                        ut.a(256);
                        ut.a(AdRequest.MAX_CONTENT_URL_LENGTH);
                        accessibilityNodeInfo.setMovementGranularities(11);
                        List list3 = (List) y84.a(x84Var, i94.a);
                        if ((list3 == null || list3.isEmpty()) && x84Var3.b(w84.a) && !Cz.d(f94Var)) {
                            accessibilityNodeInfo.setMovementGranularities(ut.e() | 4 | 16);
                        }
                    }
                    int i9 = Build.VERSION.SDK_INT;
                    if (i9 >= 26) {
                        ArrayList arrayList = new ArrayList();
                        CharSequence charSequenceG = ut.g();
                        if (!(charSequenceG == null || charSequenceG.length() == 0) && x84Var3.b(w84.a)) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (x84Var3.b(i94.r)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (!arrayList.isEmpty()) {
                            LPT4Fixed.a.a(accessibilityNodeInfo, arrayList);
                        }
                    }
                    ze3 ze3Var = (ze3) y84.a(x84Var, i94.c);
                    if (ze3Var != null) {
                        n94<FA4<j81<Float, Boolean>>> n94Var5 = w84.f;
                        if (x84Var.b(n94Var5)) {
                            ut.i("android.widget.SeekBar");
                        } else {
                            ut.i("android.widget.ProgressBar");
                        }
                        ze3 ze3Var2 = ze3.d;
                        float f = ze3Var.a;
                        rt<Float> rtVar = ze3Var.b;
                        if (ze3Var != ze3Var2) {
                            ut.m(UT.LPt8Fixed.a(rtVar.b().floatValue(), rtVar.e().floatValue(), f));
                            if (ut.f() == null) {
                                accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                                float fN = AY.n(((rtVar.e().floatValue() - rtVar.b().floatValue()) > 0.0f ? 1 : ((rtVar.e().floatValue() - rtVar.b().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f - rtVar.b().floatValue()) / (rtVar.e().floatValue() - rtVar.b().floatValue()), 0.0f, 1.0f);
                                ut.n(androidComposeView.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(fN == 0.0f ? 0 : (fN > 1.0f ? 1 : (fN == 1.0f ? 0 : -1)) == 0 ? 100 : AY.o(sy4.c(fN * 100), 1, 99))));
                            } else {
                                accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                            }
                        } else {
                            accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                            if (ut.f() == null) {
                                ut.n(androidComposeView.getContext().getResources().getString(R.string.in_progress));
                            }
                        }
                        if (x84Var3.b(n94Var5) && Cz.c(f94Var)) {
                            float fFloatValue = rtVar.e().floatValue();
                            float fFloatValue2 = rtVar.b().floatValue();
                            if (fFloatValue < fFloatValue2) {
                                fFloatValue = fFloatValue2;
                            }
                            if (f < fFloatValue) {
                                ut.b(UT.QnHx.h);
                            }
                            float fFloatValue3 = rtVar.b().floatValue();
                            float fFloatValue4 = rtVar.e().floatValue();
                            if (fFloatValue3 > fFloatValue4) {
                                fFloatValue3 = fFloatValue4;
                            }
                            if (f > fFloatValue3) {
                                ut.b(UT.QnHx.i);
                            }
                        }
                    } else {
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                    }
                    if (i9 >= 24) {
                        CQf.a(ut, f94Var);
                    }
                    bu buVar = (bu) y84.a(f94Var.f(), i94.f);
                    if (buVar != null) {
                        ut.j(UT.CQf.a(buVar.a, buVar.b, 0));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        if (y84.a(f94Var.f(), i94.e) != null) {
                            List listE2 = f94Var.e(false);
                            int size3 = listE2.size();
                            for (int i10 = 0; i10 < size3; i10++) {
                                f94 f94Var3 = (f94) listE2.get(i10);
                                if (f94Var3.f().b(i94.w)) {
                                    arrayList2.add(f94Var3);
                                }
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            boolean zB = eu.b(arrayList2);
                            int size4 = zB ? 1 : arrayList2.size();
                            if (zB) {
                                size = arrayList2.size();
                                i3 = 0;
                            } else {
                                i3 = 0;
                                size = 1;
                            }
                            ut.j(UT.CQf.a(size4, size, i3));
                        }
                    }
                    eu.j(ut, f94Var);
                    w54 w54Var = (w54) y84.a(x84Var, i94.m);
                    FA4 fa11 = (FA4) y84.a(x84Var, w84.d);
                    if (w54Var != null && fa11 != null) {
                        if (!eu.d(f94Var)) {
                            ut.i("android.widget.HorizontalScrollView");
                        }
                        if (w54Var.b.invoke().floatValue() > 0.0f) {
                            accessibilityNodeInfo.setScrollable(true);
                        }
                        if (Cz.c(f94Var)) {
                            boolean zX = Z5.x(w54Var);
                            jy1 jy1Var = jy1.Rtl;
                            if (zX) {
                                ut.b(UT.QnHx.h);
                                ut.b(!(yy1Var.N == jy1Var) ? UT.QnHx.p : UT.QnHx.n);
                            }
                            if (Z5.w(w54Var)) {
                                ut.b(UT.QnHx.i);
                                ut.b(!(yy1Var.N == jy1Var) ? UT.QnHx.n : UT.QnHx.p);
                            }
                        }
                    }
                    w54 w54Var2 = (w54) y84.a(x84Var, i94.n);
                    if (w54Var2 != null && fa11 != null) {
                        if (!eu.d(f94Var)) {
                            ut.i("android.widget.ScrollView");
                        }
                        if (w54Var2.b.invoke().floatValue() > 0.0f) {
                            accessibilityNodeInfo.setScrollable(true);
                        }
                        if (Cz.c(f94Var)) {
                            if (Z5.x(w54Var2)) {
                                ut.b(UT.QnHx.h);
                                ut.b(UT.QnHx.o);
                            }
                            if (Z5.w(w54Var2)) {
                                ut.b(UT.QnHx.i);
                                ut.b(UT.QnHx.m);
                            }
                        }
                    }
                    CharSequence charSequence = (CharSequence) y84.a(x84Var3, i94.d);
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo.setPaneTitle(charSequence);
                    } else {
                        accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                    }
                    if (Cz.c(f94Var)) {
                        FA4 fa12 = (FA4) y84.a(x84Var3, w84.l);
                        if (fa12 != null) {
                            ut.b(new UT.QnHx(262144, fa12.a));
                            sd5 sd5Var12 = sd5.a;
                        }
                        FA4 fa13 = (FA4) y84.a(x84Var3, w84.m);
                        if (fa13 != null) {
                            ut.b(new UT.QnHx(524288, fa13.a));
                            sd5 sd5Var13 = sd5.a;
                        }
                        FA4 fa14 = (FA4) y84.a(x84Var3, w84.n);
                        if (fa14 != null) {
                            ut.b(new UT.QnHx(1048576, fa14.a));
                            sd5 sd5Var14 = sd5.a;
                        }
                        n94<List<yc0>> n94Var6 = w84.p;
                        if (x84Var3.b(n94Var6)) {
                            List list4 = (List) x84Var3.c(n94Var6);
                            if (list4.size() >= 32) {
                                throw new IllegalStateException("Can't have more than 32 custom actions for one widget");
                            }
                            wq4<CharSequence> wq4Var = new wq4<>();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            wq4<Map<CharSequence, Integer>> wq4Var2 = z5.k;
                            boolean zD = wq4Var2.d(i);
                            int[] iArr = Z5.z;
                            if (zD) {
                                Map map = (Map) wq4Var2.i(i, null);
                                ArrayList arrayListK0 = oV9.k0(iArr);
                                ArrayList arrayList3 = new ArrayList();
                                int size5 = list4.size();
                                for (int i11 = 0; i11 < size5; i11++) {
                                    yc0 yc0Var = (yc0) list4.get(i11);
                                    yc0Var.getClass();
                                    if (map.containsKey(null)) {
                                        Integer num = (Integer) map.get(null);
                                        wq4Var.j(num.intValue(), null);
                                        linkedHashMap.put(null, num);
                                        arrayListK0.remove(num);
                                        ut.b(new UT.QnHx(num.intValue(), (String) null));
                                    } else {
                                        arrayList3.add(yc0Var);
                                    }
                                }
                                int size6 = arrayList3.size();
                                for (int i12 = 0; i12 < size6; i12++) {
                                    yc0 yc0Var2 = (yc0) arrayList3.get(i12);
                                    int iIntValue = ((Number) arrayListK0.get(i12)).intValue();
                                    yc0Var2.getClass();
                                    wq4Var.j(iIntValue, null);
                                    linkedHashMap.put(null, Integer.valueOf(iIntValue));
                                    ut.b(new UT.QnHx(iIntValue, (String) null));
                                }
                            } else {
                                int size7 = list4.size();
                                for (int i13 = 0; i13 < size7; i13++) {
                                    yc0 yc0Var3 = (yc0) list4.get(i13);
                                    int i14 = iArr[i13];
                                    yc0Var3.getClass();
                                    wq4Var.j(i14, null);
                                    linkedHashMap.put(null, Integer.valueOf(i14));
                                    ut.b(new UT.QnHx(i14, (String) null));
                                }
                            }
                            z5.j.j(i, wq4Var);
                            wq4Var2.j(i, linkedHashMap);
                        }
                    }
                    return accessibilityNodeInfo2;
                }
                accessibilityNodeInfoObtain.recycle();
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:319:0x04ef  */
        /* JADX WARN: Code duplicated, block: B:322:0x04f9  */
        /* JADX WARN: Code duplicated, block: B:324:0x050a  */
        /* JADX WARN: Code duplicated, block: B:325:0x0511  */
        /* JADX WARN: Code duplicated, block: B:328:0x051a  */
        /* JADX WARN: Code duplicated, block: B:330:0x0522  */
        /* JADX WARN: Code duplicated, block: B:332:0x0526  */
        /* JADX WARN: Code duplicated, block: B:335:0x0531  */
        /* JADX WARN: Code duplicated, block: B:336:0x0536  */
        /* JADX WARN: Code duplicated, block: B:338:0x053e  */
        /* JADX WARN: Code duplicated, block: B:340:0x0542  */
        /* JADX WARN: Code duplicated, block: B:343:0x054d  */
        /* JADX WARN: Code duplicated, block: B:345:0x0555  */
        /* JADX WARN: Code duplicated, block: B:389:0x05f4 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:390:0x05f6  */
        /* JADX WARN: Code duplicated, block: B:391:0x05f8  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1, types: [bm88] */
        /* JADX WARN: Type inference failed for: r9v10, types: [lpT2Fixed] */
        /* JADX WARN: Type inference failed for: r9v15, types: [LF] */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v20, types: [v2zj, wnED] */
        /* JADX WARN: Type inference failed for: r9v29 */
        /* JADX WARN: Type inference failed for: r9v30 */
        /* JADX WARN: Type inference failed for: r9v31 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b5 -> B:46:0x00b6). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:46:0x00b6
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int r18, int r19, android.os.Bundle r20) {
            /*
                Method dump skipped, instruction units count: 1682
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Z5.LPt8Fixed.performAction(int, int, android.os.Bundle):boolean");
        }
    }

    public static final class NUlFixed {
        public final f94 a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final long f;

        public NUlFixed(f94 f94Var, int i, int i2, int i3, int i4, long j) {
            this.a = f94Var;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = j;
        }
    }

    public static final class QnHx implements View.OnAttachStateChangeListener {
        public QnHx() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            Z5 z5 = Z5.this;
            z5.g.removeCallbacks(z5.w);
        }
    }

    public static final class T23 extends cx1 implements j81<k64, sd5> {
        public T23() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(k64 k64Var) {
            k64 k64Var2 = k64Var;
            Z5 z5 = Z5.this;
            z5.getClass();
            if (k64Var2.isValid()) {
                z5.d.getSnapshotObserver().a(k64Var2, z5.y, new bAJ6(z5, k64Var2));
            }
            return sd5.a;
        }
    }

    public static final class YKK {
        public final x84 a;
        public final LinkedHashSet b = new LinkedHashSet();

        public YKK(f94 f94Var, Map<Integer, g94> map) {
            this.a = f94Var.e;
            List listE = f94Var.e(false);
            int size = listE.size();
            for (int i = 0; i < size; i++) {
                f94 f94Var2 = (f94) listE.get(i);
                if (map.containsKey(Integer.valueOf(f94Var2.f))) {
                    this.b.add(Integer.valueOf(f94Var2.f));
                }
            }
        }
    }

    @if0(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {1637, 1666}, m = "boundsUpdatesEventLoop")
    public static final class auxFixed extends b90 {
        public Q6g A;
        public wo B;
        public /* synthetic */ Object C;
        public int E;
        public Z5 z;

        public auxFixed(z80<? super auxFixed> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.C = obj;
            this.E |= Integer.MIN_VALUE;
            return Z5.this.j(this);
        }
    }

    public static final class byN extends cx1 implements j81<yy1, Boolean> {
        public static final byN w = new byN();

        public byN() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        @Override // defpackage.j81
        public final Boolean invoke(yy1 yy1Var) {
            boolean z;
            x84 x84VarC;
            z84 z84VarZ = fp1.Z(yy1Var);
            if (z84VarZ != null && (x84VarC = z84VarZ.c()) != null) {
                z = x84VarC.x;
            }
            return Boolean.valueOf(z);
        }
    }

    public Z5(AndroidComposeView androidComposeView) {
        this.d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.f = (AccessibilityManager) systemService;
        this.g = new Handler(Looper.getMainLooper());
        this.h = new ZJ(new LPt8Fixed());
        this.i = Integer.MIN_VALUE;
        this.j = new wq4<>();
        this.k = new wq4<>();
        this.l = -1;
        this.n = new Q6g<>();
        this.o = AY.a(-1, null, 6);
        this.p = true;
        ds0 ds0Var = ds0.w;
        this.r = ds0Var;
        this.s = new Q6g<>();
        this.t = new LinkedHashMap();
        this.u = new YKK(androidComposeView.getSemanticsOwner().a(), ds0Var);
        androidComposeView.addOnAttachStateChangeListener(new QnHx());
        this.w = new u85(this, 2);
        this.x = new ArrayList();
        this.y = new T23();
    }

    public static /* synthetic */ void B(Z5 z5, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        z5.A(i, i2, num, null);
    }

    public static CharSequence H(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i = 100000;
        if (charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i = 99999;
        }
        return charSequence.subSequence(0, i);
    }

    public static String q(f94 f94Var) {
        Z7jl z7jl;
        if (f94Var == null) {
            return null;
        }
        n94<List<String>> n94Var = i94.a;
        x84 x84Var = f94Var.e;
        if (x84Var.b(n94Var)) {
            return X.s((List) x84Var.c(n94Var));
        }
        if (Cz.x(f94Var)) {
            Z7jl z7jlR = r(x84Var);
            if (z7jlR != null) {
                return z7jlR.w;
            }
            return null;
        }
        List list = (List) y84.a(x84Var, i94.s);
        if (list == null || (z7jl = (Z7jl) wu.J0(list)) == null) {
            return null;
        }
        return z7jl.w;
    }

    public static Z7jl r(x84 x84Var) {
        return (Z7jl) y84.a(x84Var, i94.t);
    }

    public static final boolean u(w54 w54Var, float f) {
        h81<Float> h81Var = w54Var.a;
        return (f < 0.0f && h81Var.invoke().floatValue() > 0.0f) || (f > 0.0f && h81Var.invoke().floatValue() < w54Var.b.invoke().floatValue());
    }

    public static final float v(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    public static final boolean w(w54 w54Var) {
        h81<Float> h81Var = w54Var.a;
        float fFloatValue = h81Var.invoke().floatValue();
        boolean z2 = w54Var.c;
        return (fFloatValue > 0.0f && !z2) || (h81Var.invoke().floatValue() < w54Var.b.invoke().floatValue() && z2);
    }

    public static final boolean x(w54 w54Var) {
        h81<Float> h81Var = w54Var.a;
        float fFloatValue = h81Var.invoke().floatValue();
        float fFloatValue2 = w54Var.b.invoke().floatValue();
        boolean z2 = w54Var.c;
        return (fFloatValue < fFloatValue2 && !z2) || (h81Var.invoke().floatValue() > 0.0f && z2);
    }

    public final boolean A(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !s()) {
            return false;
        }
        AccessibilityEvent accessibilityEventL = l(i, i2);
        if (num != null) {
            accessibilityEventL.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventL.setContentDescription(X.s(list));
        }
        return z(accessibilityEventL);
    }

    public final void C(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventL = l(y(i), 32);
        accessibilityEventL.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventL.getText().add(str);
        }
        z(accessibilityEventL);
    }

    public final void D(int i) {
        NUlFixed nUl = this.q;
        if (nUl != null) {
            f94 f94Var = nUl.a;
            if (i != f94Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - nUl.f <= 1000) {
                AccessibilityEvent accessibilityEventL = l(y(f94Var.f), 131072);
                accessibilityEventL.setFromIndex(nUl.d);
                accessibilityEventL.setToIndex(nUl.e);
                accessibilityEventL.setAction(nUl.b);
                accessibilityEventL.setMovementGranularity(nUl.c);
                accessibilityEventL.getText().add(q(f94Var));
                z(accessibilityEventL);
            }
        }
        this.q = null;
    }

    public final void E(f94 f94Var, YKK ykk) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List listE = f94Var.e(false);
        int size = listE.size();
        int i = 0;
        while (true) {
            yy1 yy1Var = f94Var.g;
            if (i >= size) {
                Iterator it = ykk.b.iterator();
                while (it.hasNext()) {
                    if (!linkedHashSet.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                        t(yy1Var);
                        return;
                    }
                }
                List listE2 = f94Var.e(false);
                int size2 = listE2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    f94 f94Var2 = (f94) listE2.get(i2);
                    if (p().containsKey(Integer.valueOf(f94Var2.f))) {
                        E(f94Var2, (YKK) this.t.get(Integer.valueOf(f94Var2.f)));
                    }
                }
                return;
            }
            f94 f94Var3 = (f94) listE.get(i);
            if (p().containsKey(Integer.valueOf(f94Var3.f))) {
                LinkedHashSet linkedHashSet2 = ykk.b;
                int i3 = f94Var3.f;
                if (!linkedHashSet2.contains(Integer.valueOf(i3))) {
                    t(yy1Var);
                    return;
                }
                linkedHashSet.add(Integer.valueOf(i3));
            }
            i++;
        }
    }

    public final void F(yy1 yy1Var, Q6g<Integer> q6g) {
        yy1 yy1VarM;
        z84 z84VarZ;
        if (yy1Var.E() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(yy1Var)) {
            z84 z84VarZ2 = fp1.Z(yy1Var);
            if (z84VarZ2 == null) {
                yy1 yy1VarM2 = Cz.m(yy1Var, EQ.w);
                z84VarZ2 = yy1VarM2 != null ? fp1.Z(yy1VarM2) : null;
                if (z84VarZ2 == null) {
                    return;
                }
            }
            if (!z84VarZ2.c().x && (yy1VarM = Cz.m(yy1Var, byN.w)) != null && (z84VarZ = fp1.Z(yy1VarM)) != null) {
                z84VarZ2 = z84VarZ;
            }
            int id = ((a94) z84VarZ2.x).getId();
            if (q6g.add(Integer.valueOf(id))) {
                B(this, y(id), 2048, 1, 8);
            }
        }
    }

    public final boolean G(f94 f94Var, int i, int i2, boolean z2) {
        String strQ;
        n94<FA4<y81<Integer, Integer, Boolean, Boolean>>> n94Var = w84.g;
        x84 x84Var = f94Var.e;
        if (x84Var.b(n94Var) && Cz.c(f94Var)) {
            y81 y81Var = (y81) ((FA4) x84Var.c(n94Var)).b;
            if (y81Var != null) {
                return ((Boolean) y81Var.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
            }
            return false;
        }
        if ((i == i2 && i2 == this.l) || (strQ = q(f94Var)) == null) {
            return false;
        }
        if (i < 0 || i != i2 || i2 > strQ.length()) {
            i = -1;
        }
        this.l = i;
        boolean z3 = strQ.length() > 0;
        int i3 = f94Var.f;
        z(m(y(i3), z3 ? Integer.valueOf(this.l) : null, z3 ? Integer.valueOf(this.l) : null, z3 ? Integer.valueOf(strQ.length()) : null, strQ));
        D(i3);
        return true;
    }

    public final void I(int i) {
        int i2 = this.e;
        if (i2 == i) {
            return;
        }
        this.e = i;
        B(this, i, 128, null, 12);
        B(this, i2, 256, null, 12);
    }

    @Override // defpackage.d_OZ
    public final ZJ b(View view) {
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072 A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #0 {all -> 0x00b2, blocks: (B:13:0x002c, B:23:0x0057, B:27:0x006a, B:29:0x0072, B:32:0x007d, B:34:0x0082, B:35:0x008e, B:37:0x0095, B:38:0x009e, B:18:0x0040), top: B:49:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007d A[Catch: all -> 0x00b2, TRY_ENTER, TryCatch #0 {all -> 0x00b2, blocks: (B:13:0x002c, B:23:0x0057, B:27:0x006a, B:29:0x0072, B:32:0x007d, B:34:0x0082, B:35:0x008e, B:37:0x0095, B:38:0x009e, B:18:0x0040), top: B:49:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[Catch: all -> 0x00b2, LOOP:0: B:33:0x0080->B:34:0x0082, LOOP_END, TryCatch #0 {all -> 0x00b2, blocks: (B:13:0x002c, B:23:0x0057, B:27:0x006a, B:29:0x0072, B:32:0x007d, B:34:0x0082, B:35:0x008e, B:37:0x0095, B:38:0x009e, B:18:0x0040), top: B:49:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0095 A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:13:0x002c, B:23:0x0057, B:27:0x006a, B:29:0x0072, B:32:0x007d, B:34:0x0082, B:35:0x008e, B:37:0x0095, B:38:0x009e, B:18:0x0040), top: B:49:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00af -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object j(defpackage.z80<? super defpackage.sd5> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof Z5.auxFixed
            if (r0 == 0) goto L13
            r0 = r12
            Z5$aux r0 = (Z5.auxFixed) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.E = r1
            goto L18
        L13:
            Z5$aux r0 = new Z5$aux
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.C
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            wo r2 = r0.B
            Q6g r5 = r0.A
            Z5 r6 = r0.z
            defpackage.C0239D.H(r12)     // Catch: java.lang.Throwable -> Lb2
        L2f:
            r12 = r5
            r5 = r2
            goto L57
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            wo r2 = r0.B
            Q6g r5 = r0.A
            Z5 r6 = r0.z
            defpackage.C0239D.H(r12)     // Catch: java.lang.Throwable -> Lb2
            goto L6a
        L44:
            defpackage.C0239D.H(r12)
            Q6g r12 = new Q6g     // Catch: java.lang.Throwable -> Lbc
            r12.<init>()     // Catch: java.lang.Throwable -> Lbc
            NUlFixed r2 = r11.o     // Catch: java.lang.Throwable -> Lbc
            r2.getClass()     // Catch: java.lang.Throwable -> Lbc
            NUl$QnHx r5 = new NUl$QnHx     // Catch: java.lang.Throwable -> Lbc
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lbc
            r6 = r11
        L57:
            r0.z = r6     // Catch: java.lang.Throwable -> Lb2
            r0.A = r12     // Catch: java.lang.Throwable -> Lb2
            r0.B = r5     // Catch: java.lang.Throwable -> Lb2
            r0.E = r4     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r2 = r5.a(r0)     // Catch: java.lang.Throwable -> Lb2
            if (r2 != r1) goto L66
            return r1
        L66:
            r10 = r5
            r5 = r12
            r12 = r2
            r2 = r10
        L6a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> Lb2
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> Lb2
            if (r12 == 0) goto Lb4
            r2.next()     // Catch: java.lang.Throwable -> Lb2
            boolean r12 = r6.s()     // Catch: java.lang.Throwable -> Lb2
            Q6g<yy1> r7 = r6.n
            if (r12 == 0) goto L9e
            int r12 = r7.y     // Catch: java.lang.Throwable -> Lb2
            r8 = 0
        L80:
            if (r8 >= r12) goto L8e
            java.lang.Object[] r9 = r7.x     // Catch: java.lang.Throwable -> Lb2
            r9 = r9[r8]     // Catch: java.lang.Throwable -> Lb2
            yy1 r9 = (defpackage.yy1) r9     // Catch: java.lang.Throwable -> Lb2
            r6.F(r9, r5)     // Catch: java.lang.Throwable -> Lb2
            int r8 = r8 + 1
            goto L80
        L8e:
            r5.clear()     // Catch: java.lang.Throwable -> Lb2
            boolean r12 = r6.v     // Catch: java.lang.Throwable -> Lb2
            if (r12 != 0) goto L9e
            r6.v = r4     // Catch: java.lang.Throwable -> Lb2
            android.os.Handler r12 = r6.g     // Catch: java.lang.Throwable -> Lb2
            u85 r8 = r6.w     // Catch: java.lang.Throwable -> Lb2
            r12.post(r8)     // Catch: java.lang.Throwable -> Lb2
        L9e:
            r7.clear()     // Catch: java.lang.Throwable -> Lb2
            r0.z = r6     // Catch: java.lang.Throwable -> Lb2
            r0.A = r5     // Catch: java.lang.Throwable -> Lb2
            r0.B = r2     // Catch: java.lang.Throwable -> Lb2
            r0.E = r3     // Catch: java.lang.Throwable -> Lb2
            r7 = 100
            java.lang.Object r12 = defpackage.S12N.e(r7, r0)     // Catch: java.lang.Throwable -> Lb2
            if (r12 != r1) goto L2f
            return r1
        Lb2:
            r12 = move-exception
            goto Lbe
        Lb4:
            Q6g<yy1> r12 = r6.n
            r12.clear()
            sd5 r12 = defpackage.sd5.a
            return r12
        Lbc:
            r12 = move-exception
            r6 = r11
        Lbe:
            Q6g<yy1> r0 = r6.n
            r0.clear()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Z5.j(z80):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d0  */
    public final boolean k(int i, long j, boolean z2) {
        n94<w54> n94Var;
        boolean z3;
        w54 w54Var;
        Collection<g94> collectionValues = p().values();
        if (kt2.a(j, kt2.d)) {
            return false;
        }
        if (!((Float.isNaN(kt2.c(j)) || Float.isNaN(kt2.d(j))) ? false : true)) {
            throw new IllegalStateException("Offset argument contained a NaN value.".toString());
        }
        if (z2) {
            n94Var = i94.n;
        } else {
            if (z2) {
                throw new NoWhenBranchMatchedException();
            }
            n94Var = i94.m;
        }
        Collection<g94> collection = collectionValues;
        if (collection.isEmpty()) {
            return false;
        }
        for (g94 g94Var : collection) {
            Rect rect = g94Var.b;
            if ((kt2.c(j) >= ((float) rect.left) && kt2.c(j) < ((float) rect.right) && kt2.d(j) >= ((float) rect.top) && kt2.d(j) < ((float) rect.bottom)) && (w54Var = (w54) y84.a(g94Var.a.f(), n94Var)) != null) {
                boolean z4 = w54Var.c;
                int i2 = z4 ? -i : i;
                if (i == 0 && z4) {
                    i2 = -1;
                }
                h81<Float> h81Var = w54Var.a;
                if (i2 >= 0 ? h81Var.invoke().floatValue() >= w54Var.b.invoke().floatValue() : h81Var.invoke().floatValue() <= 0.0f) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                z3 = false;
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }

    public final AccessibilityEvent l(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.d;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i);
        g94 g94Var = p().get(Integer.valueOf(i));
        if (g94Var != null) {
            accessibilityEventObtain.setPassword(g94Var.a.f().b(i94.y));
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent m(int i, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent accessibilityEventL = l(i, 8192);
        if (num != null) {
            accessibilityEventL.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventL.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventL.setItemCount(num3.intValue());
        }
        if (str != null) {
            accessibilityEventL.getText().add(str);
        }
        return accessibilityEventL;
    }

    public final int n(f94 f94Var) {
        n94<List<String>> n94Var = i94.a;
        x84 x84Var = f94Var.e;
        if (!x84Var.b(n94Var)) {
            n94<s55> n94Var2 = i94.u;
            if (x84Var.b(n94Var2)) {
                return s55.c(((s55) x84Var.c(n94Var2)).a);
            }
        }
        return this.l;
    }

    public final int o(f94 f94Var) {
        n94<List<String>> n94Var = i94.a;
        x84 x84Var = f94Var.e;
        if (!x84Var.b(n94Var)) {
            n94<s55> n94Var2 = i94.u;
            if (x84Var.b(n94Var2)) {
                return (int) (((s55) x84Var.c(n94Var2)).a >> 32);
            }
        }
        return this.l;
    }

    public final Map<Integer, g94> p() {
        if (this.p) {
            f94 f94VarA = this.d.getSemanticsOwner().a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            yy1 yy1Var = f94VarA.g;
            if (yy1Var.Q && yy1Var.E()) {
                Region region = new Region();
                region.set(hH.z(f94VarA.d()));
                Cz.q(region, f94VarA, linkedHashMap, f94VarA);
            }
            this.r = linkedHashMap;
            this.p = false;
        }
        return this.r;
    }

    public final boolean s() {
        AccessibilityManager accessibilityManager = this.f;
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public final void t(yy1 yy1Var) {
        if (this.n.add(yy1Var)) {
            this.o.H(sd5.a);
        }
    }

    public final int y(int i) {
        if (i == this.d.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    public final boolean z(AccessibilityEvent accessibilityEvent) {
        if (!s()) {
            return false;
        }
        View view = this.d;
        return view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
