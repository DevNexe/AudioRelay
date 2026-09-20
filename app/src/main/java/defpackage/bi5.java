package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.azefsw.audioconnect.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class bi5 {
    public static Field a;
    public static boolean b;
    public static ThreadLocal<Rect> c;
    public static final int[] d;
    public static final xh5 e;
    public static final QnHx f;

    public static abstract class CQf<T> {
        public final int a;
        public final Class<T> b;
        public final int c;
        public final int d;

        public CQf(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }

        public static boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T b(View view);

        public abstract void c(View view, T t);

        public final T d(View view) {
            if (Build.VERSION.SDK_INT >= this.c) {
                return b(view);
            }
            T t = (T) view.getTag(this.a);
            if (this.b.isInstance(t)) {
                return t;
            }
            return null;
        }

        public final void e(View view, T t) {
            d_OZ d_oz;
            if (Build.VERSION.SDK_INT >= this.c) {
                c(view, t);
                return;
            }
            if (f(d(view), t)) {
                View.AccessibilityDelegate accessibilityDelegateB = bi5.b(view);
                if (accessibilityDelegateB == null) {
                    d_oz = null;
                } else {
                    d_oz = accessibilityDelegateB instanceof d_OZ.QnHx ? ((d_OZ.QnHx) accessibilityDelegateB).a : new d_OZ(accessibilityDelegateB);
                }
                if (d_oz == null) {
                    d_oz = new d_OZ();
                }
                bi5.m(view, d_oz);
                view.setTag(this.a, t);
                bi5.f(view, this.d);
            }
        }

        public abstract boolean f(T t, T t2);
    }

    public static class EQ {
        public static jm5 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            jm5 jm5VarG = jm5.g(rootWindowInsets, null);
            jm5.FJCM fjcm = jm5VarG.a;
            fjcm.m(jm5VarG);
            fjcm.d(view.getRootView());
            return jm5VarG;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i) {
            view.setScrollIndicators(i);
        }

        public static void d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    public static class F1 {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    public static class FJCM {
        public static void a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        public static void l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        public static void m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        public static void n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static final class LPt6Fixed implements OnReceiveContentListener {
        public final tu2 a;

        public LPt6Fixed(tu2 tu2Var) {
            this.a = tu2Var;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            d80 d80Var = new d80(new d80.LPt8Fixed(contentInfo));
            d80 d80VarA = this.a.a(view, d80Var);
            if (d80VarA == null) {
                return null;
            }
            if (d80VarA == d80Var) {
                return contentInfo;
            }
            ContentInfo contentInfoF = d80VarA.a.f();
            Objects.requireNonNull(contentInfoF);
            return contentInfoF;
        }
    }

    public static class LPt8Fixed {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        public static void s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    public static final class MZ {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static d80 b(View view, d80 d80Var) {
            ContentInfo contentInfoF = d80Var.a.f();
            Objects.requireNonNull(contentInfoF);
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? d80Var : new d80(new d80.LPt8Fixed(contentInfoPerformReceiveContent));
        }

        public static void c(View view, String[] strArr, tu2 tu2Var) {
            if (tu2Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new LPt6Fixed(tu2Var));
            }
        }
    }

    public static class NUlFixed {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i) {
            view.setLabelFor(i);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i) {
            view.setLayoutDirection(i);
        }

        public static void k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    public static class PRnFixed {
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, li5] */
        public static void a(View view, final Xn1 xn1) {
            ok4 ok4Var = (ok4) view.getTag(R.id.tag_unhandled_key_listeners);
            if (ok4Var == null) {
                ok4Var = new ok4();
                view.setTag(R.id.tag_unhandled_key_listeners, ok4Var);
            }
            Objects.requireNonNull(xn1);
            ?? r0 = new View$OnUnhandledKeyEventListener() { // from class: li5
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return xn1.a();
                }
            };
            ok4Var.put(xn1, r0);
            view.addOnUnhandledKeyEventListener(r0);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, Xn1 xn1) {
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener;
            ok4 ok4Var = (ok4) view.getTag(R.id.tag_unhandled_key_listeners);
            if (ok4Var == null || (view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener) ok4Var.getOrDefault(xn1, null)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        public static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    public static class QnHx implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap<View, Boolean> w = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                WeakHashMap<View, Boolean> weakHashMap = this.w;
                for (Map.Entry<View, Boolean> entry : weakHashMap.entrySet()) {
                    View key = entry.getKey();
                    boolean zBooleanValue = entry.getValue().booleanValue();
                    boolean z = key.isShown() && key.getWindowVisibility() == 0;
                    if (zBooleanValue != z) {
                        bi5.f(key, z ? 16 : 32);
                        weakHashMap.put(key, Boolean.valueOf(z));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public static class RBi {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static class T23 {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public interface Xn1 {
        boolean a();
    }

    public static class YKK {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    public static class auxFixed {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        public static void f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    public static class byN {

        public class QnHx implements View.OnApplyWindowInsetsListener {
            public jm5 a = null;
            public final /* synthetic */ View b;
            public final /* synthetic */ gu2 c;

            public QnHx(View view, gu2 gu2Var) {
                this.b = view;
                this.c = gu2Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                jm5 jm5VarG = jm5.g(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                gu2 gu2Var = this.c;
                if (i < 30) {
                    byN.a(windowInsets, this.b);
                    if (jm5VarG.equals(this.a)) {
                        return gu2Var.a(view, jm5VarG).f();
                    }
                }
                this.a = jm5VarG;
                jm5 jm5VarA = gu2Var.a(view, jm5VarG);
                if (i >= 30) {
                    return jm5VarA.f();
                }
                Field field = bi5.a;
                T23.c(view);
                return jm5VarA.f();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static jm5 b(View view, jm5 jm5Var, Rect rect) {
            WindowInsets windowInsetsF = jm5Var.f();
            if (windowInsetsF != null) {
                return jm5.g(view.computeSystemWindowInsets(windowInsetsF, rect), view);
            }
            rect.setEmpty();
            return jm5Var;
        }

        public static boolean c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        public static boolean d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        public static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        public static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static jm5 j(View view) {
            jm5.NUlFixed f1;
            if (jm5.QnHx.d && view.isAttachedToWindow()) {
                try {
                    Object obj = jm5.QnHx.a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) jm5.QnHx.b.get(obj);
                        Rect rect2 = (Rect) jm5.QnHx.c.get(obj);
                        if (rect != null && rect2 != null) {
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 30) {
                                f1 = new jm5.LPt8Fixed();
                            } else {
                                f1 = i >= 29 ? new jm5.F1() : new jm5.CQf();
                            }
                            f1.c(uo1.a(rect.left, rect.top, rect.right, rect.bottom));
                            f1.d(uo1.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            jm5 jm5VarB = f1.b();
                            jm5VarB.a.m(jm5VarB);
                            jm5VarB.a.d(view.getRootView());
                            return jm5VarB;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f) {
            view.setElevation(f);
        }

        public static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        public static void u(View view, gu2 gu2Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, gu2Var);
            }
            if (gu2Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new QnHx(view, gu2Var));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void x(View view, float f) {
            view.setZ(f);
        }

        public static boolean y(View view, int i) {
            return view.startNestedScroll(i);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class ta {
        public static final ArrayList<WeakReference<View>> d = new ArrayList<>();
        public WeakHashMap<View, Boolean> a = null;
        public SparseArray<WeakReference<View>> b = null;
        public WeakReference<KeyEvent> c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((Xn1) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            View viewA;
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        viewA = a(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (viewA == null);
                return viewA;
            }
            if (b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    public static class y {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [xh5] */
    static {
        new AtomicInteger(1);
        b = false;
        d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        e = new uu2() { // from class: xh5
            @Override // defpackage.uu2
            public final d80 a(d80 d80Var) {
                return d80Var;
            }
        };
        f = new QnHx();
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = ta.d;
        ta taVar = (ta) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (taVar == null) {
            taVar = new ta();
            view.setTag(R.id.tag_unhandled_key_event_manager, taVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = taVar.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = ta.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (taVar.a == null) {
                        taVar.a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = ta.d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            taVar.a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                taVar.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View viewA = taVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (taVar.b == null) {
                    taVar.b = new SparseArray<>();
                }
                taVar.b.put(keyCode, new WeakReference<>(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate b(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return y.a(view);
        }
        if (b) {
            return null;
        }
        if (a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                b = true;
                return null;
            }
        }
        try {
            Object obj = a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            b = true;
            return null;
        }
    }

    public static ArrayList c(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static Rect d() {
        if (c == null) {
            c = new ThreadLocal<>();
        }
        Rect rect = c.get();
        if (rect == null) {
            rect = new Rect();
            c.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] e(View view) {
        return Build.VERSION.SDK_INT >= 31 ? MZ.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void f(View view, int i) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = Build.VERSION.SDK_INT;
            Object objB = null;
            if (i2 >= 28) {
                tag = PRnFixed.b(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (auxFixed.a(view) != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                auxFixed.g(accessibilityEventObtain, i);
                if (z) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i2 >= 28) {
                        objB = PRnFixed.b(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            objB = tag2;
                        }
                    }
                    text.add((CharSequence) objB);
                    if (LPt8Fixed.c(view) == 0) {
                        LPt8Fixed.s(view, 1);
                    }
                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                        if (LPt8Fixed.c((View) parent) == 4) {
                            LPt8Fixed.s(view, 2);
                            break;
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        auxFixed.e(view.getParent(), view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            auxFixed.g(accessibilityEventObtain2, i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i2 >= 28) {
                objB = PRnFixed.b(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    objB = tag3;
                }
            }
            text2.add((CharSequence) objB);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void g(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect rectD = d();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectD.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectD.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            o(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                o((View) parent2);
            }
        }
        if (z && rectD.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectD);
        }
    }

    public static void h(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect rectD = d();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectD.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rectD.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            o(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                o((View) parent2);
            }
        }
        if (z && rectD.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectD);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d80 i(View view, d80 d80Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + d80Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return MZ.b(view, d80Var);
        }
        tu2 tu2Var = (tu2) view.getTag(R.id.tag_on_receive_content_listener);
        uu2 uu2Var = e;
        if (tu2Var == null) {
            if (view instanceof uu2) {
                uu2Var = (uu2) view;
            }
            return uu2Var.a(d80Var);
        }
        d80 d80VarA = tu2Var.a(view, d80Var);
        if (d80VarA == null) {
            return null;
        }
        if (view instanceof uu2) {
            uu2Var = (uu2) view;
        }
        return uu2Var.a(d80VarA);
    }

    public static void j(View view, int i) {
        ArrayList arrayListC = c(view);
        for (int i2 = 0; i2 < arrayListC.size(); i2++) {
            if (((UT.QnHx) arrayListC.get(i2)).a() == i) {
                arrayListC.remove(i2);
                return;
            }
        }
    }

    public static void k(View view, UT.QnHx qnHx, PFC pfc) {
        d_OZ d_oz;
        UT.QnHx qnHx2 = new UT.QnHx(null, qnHx.b, null, pfc, qnHx.c);
        View.AccessibilityDelegate accessibilityDelegateB = b(view);
        if (accessibilityDelegateB == null) {
            d_oz = null;
        } else {
            d_oz = accessibilityDelegateB instanceof d_OZ.QnHx ? ((d_OZ.QnHx) accessibilityDelegateB).a : new d_OZ(accessibilityDelegateB);
        }
        if (d_oz == null) {
            d_oz = new d_OZ();
        }
        m(view, d_oz);
        j(view, qnHx2.a());
        c(view).add(qnHx2);
        f(view, 0);
    }

    public static void l(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            y.c(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void m(View view, d_OZ d_oz) {
        if (d_oz == null && (b(view) instanceof d_OZ.QnHx)) {
            d_oz = new d_OZ();
        }
        view.setAccessibilityDelegate(d_oz == null ? null : d_oz.b);
    }

    public static void n(View view, CharSequence charSequence) {
        new yh5().e(view, charSequence);
        QnHx qnHx = f;
        if (charSequence == null) {
            qnHx.w.remove(view);
            view.removeOnAttachStateChangeListener(qnHx);
            LPt8Fixed.o(view.getViewTreeObserver(), qnHx);
        } else {
            qnHx.w.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(qnHx);
            if (auxFixed.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(qnHx);
            }
        }
    }

    public static void o(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
