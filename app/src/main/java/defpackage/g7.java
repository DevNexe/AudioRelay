package defpackage;

import android.R;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzanm;
import com.google.android.gms.internal.ads.zzaqb;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzfzv;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgam;
import com.google.android.gms.internal.ads.zzgar;
import com.google.android.gms.internal.ads.zzgbe;
import com.google.android.gms.internal.ads.zzgdl;
import com.google.android.gms.internal.ads.zzgdo;
import com.google.android.gms.internal.ads.zzgix;
import com.google.android.gms.internal.ads.zzgjo;
import com.google.android.gms.internal.ads.zzgoz;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class g7 implements vt0, ba, qf6 {
    public static ej1 H;
    public static zzgaa I;
    public static ej1 w;
    public static final int[] x = {R.attr.orientation, R.attr.id, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.translationZ, R.attr.elevation, com.azefsw.audioconnect.R.attr.animate_relativeTo, com.azefsw.audioconnect.R.attr.barrierAllowsGoneWidgets, com.azefsw.audioconnect.R.attr.barrierDirection, com.azefsw.audioconnect.R.attr.barrierMargin, com.azefsw.audioconnect.R.attr.chainUseRtl, com.azefsw.audioconnect.R.attr.constraint_referenced_ids, com.azefsw.audioconnect.R.attr.drawPath, com.azefsw.audioconnect.R.attr.flow_firstHorizontalBias, com.azefsw.audioconnect.R.attr.flow_firstHorizontalStyle, com.azefsw.audioconnect.R.attr.flow_firstVerticalBias, com.azefsw.audioconnect.R.attr.flow_firstVerticalStyle, com.azefsw.audioconnect.R.attr.flow_horizontalAlign, com.azefsw.audioconnect.R.attr.flow_horizontalBias, com.azefsw.audioconnect.R.attr.flow_horizontalGap, com.azefsw.audioconnect.R.attr.flow_horizontalStyle, com.azefsw.audioconnect.R.attr.flow_lastHorizontalBias, com.azefsw.audioconnect.R.attr.flow_lastHorizontalStyle, com.azefsw.audioconnect.R.attr.flow_lastVerticalBias, com.azefsw.audioconnect.R.attr.flow_lastVerticalStyle, com.azefsw.audioconnect.R.attr.flow_maxElementsWrap, com.azefsw.audioconnect.R.attr.flow_verticalAlign, com.azefsw.audioconnect.R.attr.flow_verticalBias, com.azefsw.audioconnect.R.attr.flow_verticalGap, com.azefsw.audioconnect.R.attr.flow_verticalStyle, com.azefsw.audioconnect.R.attr.flow_wrapMode, com.azefsw.audioconnect.R.attr.layout_constrainedHeight, com.azefsw.audioconnect.R.attr.layout_constrainedWidth, com.azefsw.audioconnect.R.attr.layout_constraintBaseline_creator, com.azefsw.audioconnect.R.attr.layout_constraintBaseline_toBaselineOf, com.azefsw.audioconnect.R.attr.layout_constraintBottom_creator, com.azefsw.audioconnect.R.attr.layout_constraintBottom_toBottomOf, com.azefsw.audioconnect.R.attr.layout_constraintBottom_toTopOf, com.azefsw.audioconnect.R.attr.layout_constraintCircle, com.azefsw.audioconnect.R.attr.layout_constraintCircleAngle, com.azefsw.audioconnect.R.attr.layout_constraintCircleRadius, com.azefsw.audioconnect.R.attr.layout_constraintDimensionRatio, com.azefsw.audioconnect.R.attr.layout_constraintEnd_toEndOf, com.azefsw.audioconnect.R.attr.layout_constraintEnd_toStartOf, com.azefsw.audioconnect.R.attr.layout_constraintGuide_begin, com.azefsw.audioconnect.R.attr.layout_constraintGuide_end, com.azefsw.audioconnect.R.attr.layout_constraintGuide_percent, com.azefsw.audioconnect.R.attr.layout_constraintHeight_default, com.azefsw.audioconnect.R.attr.layout_constraintHeight_max, com.azefsw.audioconnect.R.attr.layout_constraintHeight_min, com.azefsw.audioconnect.R.attr.layout_constraintHeight_percent, com.azefsw.audioconnect.R.attr.layout_constraintHorizontal_bias, com.azefsw.audioconnect.R.attr.layout_constraintHorizontal_chainStyle, com.azefsw.audioconnect.R.attr.layout_constraintHorizontal_weight, com.azefsw.audioconnect.R.attr.layout_constraintLeft_creator, com.azefsw.audioconnect.R.attr.layout_constraintLeft_toLeftOf, com.azefsw.audioconnect.R.attr.layout_constraintLeft_toRightOf, com.azefsw.audioconnect.R.attr.layout_constraintRight_creator, com.azefsw.audioconnect.R.attr.layout_constraintRight_toLeftOf, com.azefsw.audioconnect.R.attr.layout_constraintRight_toRightOf, com.azefsw.audioconnect.R.attr.layout_constraintStart_toEndOf, com.azefsw.audioconnect.R.attr.layout_constraintStart_toStartOf, com.azefsw.audioconnect.R.attr.layout_constraintTag, com.azefsw.audioconnect.R.attr.layout_constraintTop_creator, com.azefsw.audioconnect.R.attr.layout_constraintTop_toBottomOf, com.azefsw.audioconnect.R.attr.layout_constraintTop_toTopOf, com.azefsw.audioconnect.R.attr.layout_constraintVertical_bias, com.azefsw.audioconnect.R.attr.layout_constraintVertical_chainStyle, com.azefsw.audioconnect.R.attr.layout_constraintVertical_weight, com.azefsw.audioconnect.R.attr.layout_constraintWidth_default, com.azefsw.audioconnect.R.attr.layout_constraintWidth_max, com.azefsw.audioconnect.R.attr.layout_constraintWidth_min, com.azefsw.audioconnect.R.attr.layout_constraintWidth_percent, com.azefsw.audioconnect.R.attr.layout_editor_absoluteX, com.azefsw.audioconnect.R.attr.layout_editor_absoluteY, com.azefsw.audioconnect.R.attr.layout_goneMarginBottom, com.azefsw.audioconnect.R.attr.layout_goneMarginEnd, com.azefsw.audioconnect.R.attr.layout_goneMarginLeft, com.azefsw.audioconnect.R.attr.layout_goneMarginRight, com.azefsw.audioconnect.R.attr.layout_goneMarginStart, com.azefsw.audioconnect.R.attr.layout_goneMarginTop, com.azefsw.audioconnect.R.attr.motionProgress, com.azefsw.audioconnect.R.attr.motionStagger, com.azefsw.audioconnect.R.attr.pathMotionArc, com.azefsw.audioconnect.R.attr.pivotAnchor, com.azefsw.audioconnect.R.attr.transitionEasing, com.azefsw.audioconnect.R.attr.transitionPathRotate, com.azefsw.audioconnect.R.attr.visibilityMode};
    public static final int[] y = {R.attr.orientation, R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom, R.attr.visibility, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.paddingStart, R.attr.paddingEnd, R.attr.elevation, com.azefsw.audioconnect.R.attr.barrierAllowsGoneWidgets, com.azefsw.audioconnect.R.attr.barrierDirection, com.azefsw.audioconnect.R.attr.barrierMargin, com.azefsw.audioconnect.R.attr.chainUseRtl, com.azefsw.audioconnect.R.attr.constraintSet, com.azefsw.audioconnect.R.attr.constraint_referenced_ids, com.azefsw.audioconnect.R.attr.flow_firstHorizontalBias, com.azefsw.audioconnect.R.attr.flow_firstHorizontalStyle, com.azefsw.audioconnect.R.attr.flow_firstVerticalBias, com.azefsw.audioconnect.R.attr.flow_firstVerticalStyle, com.azefsw.audioconnect.R.attr.flow_horizontalAlign, com.azefsw.audioconnect.R.attr.flow_horizontalBias, com.azefsw.audioconnect.R.attr.flow_horizontalGap, com.azefsw.audioconnect.R.attr.flow_horizontalStyle, com.azefsw.audioconnect.R.attr.flow_lastHorizontalBias, com.azefsw.audioconnect.R.attr.flow_lastHorizontalStyle, com.azefsw.audioconnect.R.attr.flow_lastVerticalBias, com.azefsw.audioconnect.R.attr.flow_lastVerticalStyle, com.azefsw.audioconnect.R.attr.flow_maxElementsWrap, com.azefsw.audioconnect.R.attr.flow_verticalAlign, com.azefsw.audioconnect.R.attr.flow_verticalBias, com.azefsw.audioconnect.R.attr.flow_verticalGap, com.azefsw.audioconnect.R.attr.flow_verticalStyle, com.azefsw.audioconnect.R.attr.flow_wrapMode, com.azefsw.audioconnect.R.attr.layoutDescription, com.azefsw.audioconnect.R.attr.layout_constrainedHeight, com.azefsw.audioconnect.R.attr.layout_constrainedWidth, com.azefsw.audioconnect.R.attr.layout_constraintBaseline_creator, com.azefsw.audioconnect.R.attr.layout_constraintBaseline_toBaselineOf, com.azefsw.audioconnect.R.attr.layout_constraintBottom_creator, com.azefsw.audioconnect.R.attr.layout_constraintBottom_toBottomOf, com.azefsw.audioconnect.R.attr.layout_constraintBottom_toTopOf, com.azefsw.audioconnect.R.attr.layout_constraintCircle, com.azefsw.audioconnect.R.attr.layout_constraintCircleAngle, com.azefsw.audioconnect.R.attr.layout_constraintCircleRadius, com.azefsw.audioconnect.R.attr.layout_constraintDimensionRatio, com.azefsw.audioconnect.R.attr.layout_constraintEnd_toEndOf, com.azefsw.audioconnect.R.attr.layout_constraintEnd_toStartOf, com.azefsw.audioconnect.R.attr.layout_constraintGuide_begin, com.azefsw.audioconnect.R.attr.layout_constraintGuide_end, com.azefsw.audioconnect.R.attr.layout_constraintGuide_percent, com.azefsw.audioconnect.R.attr.layout_constraintHeight_default, com.azefsw.audioconnect.R.attr.layout_constraintHeight_max, com.azefsw.audioconnect.R.attr.layout_constraintHeight_min, com.azefsw.audioconnect.R.attr.layout_constraintHeight_percent, com.azefsw.audioconnect.R.attr.layout_constraintHorizontal_bias, com.azefsw.audioconnect.R.attr.layout_constraintHorizontal_chainStyle, com.azefsw.audioconnect.R.attr.layout_constraintHorizontal_weight, com.azefsw.audioconnect.R.attr.layout_constraintLeft_creator, com.azefsw.audioconnect.R.attr.layout_constraintLeft_toLeftOf, com.azefsw.audioconnect.R.attr.layout_constraintLeft_toRightOf, com.azefsw.audioconnect.R.attr.layout_constraintRight_creator, com.azefsw.audioconnect.R.attr.layout_constraintRight_toLeftOf, com.azefsw.audioconnect.R.attr.layout_constraintRight_toRightOf, com.azefsw.audioconnect.R.attr.layout_constraintStart_toEndOf, com.azefsw.audioconnect.R.attr.layout_constraintStart_toStartOf, com.azefsw.audioconnect.R.attr.layout_constraintTag, com.azefsw.audioconnect.R.attr.layout_constraintTop_creator, com.azefsw.audioconnect.R.attr.layout_constraintTop_toBottomOf, com.azefsw.audioconnect.R.attr.layout_constraintTop_toTopOf, com.azefsw.audioconnect.R.attr.layout_constraintVertical_bias, com.azefsw.audioconnect.R.attr.layout_constraintVertical_chainStyle, com.azefsw.audioconnect.R.attr.layout_constraintVertical_weight, com.azefsw.audioconnect.R.attr.layout_constraintWidth_default, com.azefsw.audioconnect.R.attr.layout_constraintWidth_max, com.azefsw.audioconnect.R.attr.layout_constraintWidth_min, com.azefsw.audioconnect.R.attr.layout_constraintWidth_percent, com.azefsw.audioconnect.R.attr.layout_editor_absoluteX, com.azefsw.audioconnect.R.attr.layout_editor_absoluteY, com.azefsw.audioconnect.R.attr.layout_goneMarginBottom, com.azefsw.audioconnect.R.attr.layout_goneMarginEnd, com.azefsw.audioconnect.R.attr.layout_goneMarginLeft, com.azefsw.audioconnect.R.attr.layout_goneMarginRight, com.azefsw.audioconnect.R.attr.layout_goneMarginStart, com.azefsw.audioconnect.R.attr.layout_goneMarginTop, com.azefsw.audioconnect.R.attr.layout_optimizationLevel};
    public static final int[] z = {R.attr.orientation, R.attr.id, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.pivotX, R.attr.pivotY, R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.translationZ, R.attr.elevation, com.azefsw.audioconnect.R.attr.animate_relativeTo, com.azefsw.audioconnect.R.attr.barrierAllowsGoneWidgets, com.azefsw.audioconnect.R.attr.barrierDirection, com.azefsw.audioconnect.R.attr.barrierMargin, com.azefsw.audioconnect.R.attr.chainUseRtl, com.azefsw.audioconnect.R.attr.constraint_referenced_ids, com.azefsw.audioconnect.R.attr.deriveConstraintsFrom, com.azefsw.audioconnect.R.attr.drawPath, com.azefsw.audioconnect.R.attr.flow_firstHorizontalBias, com.azefsw.audioconnect.R.attr.flow_firstHorizontalStyle, com.azefsw.audioconnect.R.attr.flow_firstVerticalBias, com.azefsw.audioconnect.R.attr.flow_firstVerticalStyle, com.azefsw.audioconnect.R.attr.flow_horizontalAlign, com.azefsw.audioconnect.R.attr.flow_horizontalBias, com.azefsw.audioconnect.R.attr.flow_horizontalGap, com.azefsw.audioconnect.R.attr.flow_horizontalStyle, com.azefsw.audioconnect.R.attr.flow_lastHorizontalBias, com.azefsw.audioconnect.R.attr.flow_lastHorizontalStyle, com.azefsw.audioconnect.R.attr.flow_lastVerticalBias, com.azefsw.audioconnect.R.attr.flow_lastVerticalStyle, com.azefsw.audioconnect.R.attr.flow_maxElementsWrap, com.azefsw.audioconnect.R.attr.flow_verticalAlign, com.azefsw.audioconnect.R.attr.flow_verticalBias, com.azefsw.audioconnect.R.attr.flow_verticalGap, com.azefsw.audioconnect.R.attr.flow_verticalStyle, com.azefsw.audioconnect.R.attr.flow_wrapMode, com.azefsw.audioconnect.R.attr.layout_constrainedHeight, com.azefsw.audioconnect.R.attr.layout_constrainedWidth, com.azefsw.audioconnect.R.attr.layout_constraintBaseline_creator, com.azefsw.audioconnect.R.attr.layout_constraintBaseline_toBaselineOf, com.azefsw.audioconnect.R.attr.layout_constraintBottom_creator, com.azefsw.audioconnect.R.attr.layout_constraintBottom_toBottomOf, com.azefsw.audioconnect.R.attr.layout_constraintBottom_toTopOf, com.azefsw.audioconnect.R.attr.layout_constraintCircle, com.azefsw.audioconnect.R.attr.layout_constraintCircleAngle, com.azefsw.audioconnect.R.attr.layout_constraintCircleRadius, com.azefsw.audioconnect.R.attr.layout_constraintDimensionRatio, com.azefsw.audioconnect.R.attr.layout_constraintEnd_toEndOf, com.azefsw.audioconnect.R.attr.layout_constraintEnd_toStartOf, com.azefsw.audioconnect.R.attr.layout_constraintGuide_begin, com.azefsw.audioconnect.R.attr.layout_constraintGuide_end, com.azefsw.audioconnect.R.attr.layout_constraintGuide_percent, com.azefsw.audioconnect.R.attr.layout_constraintHeight_default, com.azefsw.audioconnect.R.attr.layout_constraintHeight_max, com.azefsw.audioconnect.R.attr.layout_constraintHeight_min, com.azefsw.audioconnect.R.attr.layout_constraintHeight_percent, com.azefsw.audioconnect.R.attr.layout_constraintHorizontal_bias, com.azefsw.audioconnect.R.attr.layout_constraintHorizontal_chainStyle, com.azefsw.audioconnect.R.attr.layout_constraintHorizontal_weight, com.azefsw.audioconnect.R.attr.layout_constraintLeft_creator, com.azefsw.audioconnect.R.attr.layout_constraintLeft_toLeftOf, com.azefsw.audioconnect.R.attr.layout_constraintLeft_toRightOf, com.azefsw.audioconnect.R.attr.layout_constraintRight_creator, com.azefsw.audioconnect.R.attr.layout_constraintRight_toLeftOf, com.azefsw.audioconnect.R.attr.layout_constraintRight_toRightOf, com.azefsw.audioconnect.R.attr.layout_constraintStart_toEndOf, com.azefsw.audioconnect.R.attr.layout_constraintStart_toStartOf, com.azefsw.audioconnect.R.attr.layout_constraintTag, com.azefsw.audioconnect.R.attr.layout_constraintTop_creator, com.azefsw.audioconnect.R.attr.layout_constraintTop_toBottomOf, com.azefsw.audioconnect.R.attr.layout_constraintTop_toTopOf, com.azefsw.audioconnect.R.attr.layout_constraintVertical_bias, com.azefsw.audioconnect.R.attr.layout_constraintVertical_chainStyle, com.azefsw.audioconnect.R.attr.layout_constraintVertical_weight, com.azefsw.audioconnect.R.attr.layout_constraintWidth_default, com.azefsw.audioconnect.R.attr.layout_constraintWidth_max, com.azefsw.audioconnect.R.attr.layout_constraintWidth_min, com.azefsw.audioconnect.R.attr.layout_constraintWidth_percent, com.azefsw.audioconnect.R.attr.layout_editor_absoluteX, com.azefsw.audioconnect.R.attr.layout_editor_absoluteY, com.azefsw.audioconnect.R.attr.layout_goneMarginBottom, com.azefsw.audioconnect.R.attr.layout_goneMarginEnd, com.azefsw.audioconnect.R.attr.layout_goneMarginLeft, com.azefsw.audioconnect.R.attr.layout_goneMarginRight, com.azefsw.audioconnect.R.attr.layout_goneMarginStart, com.azefsw.audioconnect.R.attr.layout_goneMarginTop, com.azefsw.audioconnect.R.attr.motionProgress, com.azefsw.audioconnect.R.attr.motionStagger, com.azefsw.audioconnect.R.attr.pathMotionArc, com.azefsw.audioconnect.R.attr.pivotAnchor, com.azefsw.audioconnect.R.attr.transitionEasing, com.azefsw.audioconnect.R.attr.transitionPathRotate};
    public static final int[] A = {com.azefsw.audioconnect.R.attr.attributeName, com.azefsw.audioconnect.R.attr.customBoolean, com.azefsw.audioconnect.R.attr.customColorDrawableValue, com.azefsw.audioconnect.R.attr.customColorValue, com.azefsw.audioconnect.R.attr.customDimension, com.azefsw.audioconnect.R.attr.customFloatValue, com.azefsw.audioconnect.R.attr.customIntegerValue, com.azefsw.audioconnect.R.attr.customPixelDimension, com.azefsw.audioconnect.R.attr.customStringValue};
    public static final int[] B = {R.attr.orientation, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.layout_marginStart, R.attr.layout_marginEnd, com.azefsw.audioconnect.R.attr.barrierAllowsGoneWidgets, com.azefsw.audioconnect.R.attr.barrierDirection, com.azefsw.audioconnect.R.attr.barrierMargin, com.azefsw.audioconnect.R.attr.chainUseRtl, com.azefsw.audioconnect.R.attr.constraint_referenced_ids, com.azefsw.audioconnect.R.attr.layout_constrainedHeight, com.azefsw.audioconnect.R.attr.layout_constrainedWidth, com.azefsw.audioconnect.R.attr.layout_constraintBaseline_creator, com.azefsw.audioconnect.R.attr.layout_constraintBaseline_toBaselineOf, com.azefsw.audioconnect.R.attr.layout_constraintBottom_creator, com.azefsw.audioconnect.R.attr.layout_constraintBottom_toBottomOf, com.azefsw.audioconnect.R.attr.layout_constraintBottom_toTopOf, com.azefsw.audioconnect.R.attr.layout_constraintCircle, com.azefsw.audioconnect.R.attr.layout_constraintCircleAngle, com.azefsw.audioconnect.R.attr.layout_constraintCircleRadius, com.azefsw.audioconnect.R.attr.layout_constraintDimensionRatio, com.azefsw.audioconnect.R.attr.layout_constraintEnd_toEndOf, com.azefsw.audioconnect.R.attr.layout_constraintEnd_toStartOf, com.azefsw.audioconnect.R.attr.layout_constraintGuide_begin, com.azefsw.audioconnect.R.attr.layout_constraintGuide_end, com.azefsw.audioconnect.R.attr.layout_constraintGuide_percent, com.azefsw.audioconnect.R.attr.layout_constraintHeight_default, com.azefsw.audioconnect.R.attr.layout_constraintHeight_max, com.azefsw.audioconnect.R.attr.layout_constraintHeight_min, com.azefsw.audioconnect.R.attr.layout_constraintHeight_percent, com.azefsw.audioconnect.R.attr.layout_constraintHorizontal_bias, com.azefsw.audioconnect.R.attr.layout_constraintHorizontal_chainStyle, com.azefsw.audioconnect.R.attr.layout_constraintHorizontal_weight, com.azefsw.audioconnect.R.attr.layout_constraintLeft_creator, com.azefsw.audioconnect.R.attr.layout_constraintLeft_toLeftOf, com.azefsw.audioconnect.R.attr.layout_constraintLeft_toRightOf, com.azefsw.audioconnect.R.attr.layout_constraintRight_creator, com.azefsw.audioconnect.R.attr.layout_constraintRight_toLeftOf, com.azefsw.audioconnect.R.attr.layout_constraintRight_toRightOf, com.azefsw.audioconnect.R.attr.layout_constraintStart_toEndOf, com.azefsw.audioconnect.R.attr.layout_constraintStart_toStartOf, com.azefsw.audioconnect.R.attr.layout_constraintTop_creator, com.azefsw.audioconnect.R.attr.layout_constraintTop_toBottomOf, com.azefsw.audioconnect.R.attr.layout_constraintTop_toTopOf, com.azefsw.audioconnect.R.attr.layout_constraintVertical_bias, com.azefsw.audioconnect.R.attr.layout_constraintVertical_chainStyle, com.azefsw.audioconnect.R.attr.layout_constraintVertical_weight, com.azefsw.audioconnect.R.attr.layout_constraintWidth_default, com.azefsw.audioconnect.R.attr.layout_constraintWidth_max, com.azefsw.audioconnect.R.attr.layout_constraintWidth_min, com.azefsw.audioconnect.R.attr.layout_constraintWidth_percent, com.azefsw.audioconnect.R.attr.layout_editor_absoluteX, com.azefsw.audioconnect.R.attr.layout_editor_absoluteY, com.azefsw.audioconnect.R.attr.layout_goneMarginBottom, com.azefsw.audioconnect.R.attr.layout_goneMarginEnd, com.azefsw.audioconnect.R.attr.layout_goneMarginLeft, com.azefsw.audioconnect.R.attr.layout_goneMarginRight, com.azefsw.audioconnect.R.attr.layout_goneMarginStart, com.azefsw.audioconnect.R.attr.layout_goneMarginTop, com.azefsw.audioconnect.R.attr.maxHeight, com.azefsw.audioconnect.R.attr.maxWidth, com.azefsw.audioconnect.R.attr.minHeight, com.azefsw.audioconnect.R.attr.minWidth};
    public static final int[] C = {com.azefsw.audioconnect.R.attr.animate_relativeTo, com.azefsw.audioconnect.R.attr.drawPath, com.azefsw.audioconnect.R.attr.motionPathRotate, com.azefsw.audioconnect.R.attr.motionStagger, com.azefsw.audioconnect.R.attr.pathMotionArc, com.azefsw.audioconnect.R.attr.transitionEasing};
    public static final int[] D = {R.attr.visibility, R.attr.alpha, com.azefsw.audioconnect.R.attr.layout_constraintTag, com.azefsw.audioconnect.R.attr.motionProgress, com.azefsw.audioconnect.R.attr.visibilityMode};
    public static final int[] E = {R.attr.id, com.azefsw.audioconnect.R.attr.constraints};
    public static final int[] F = {R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation};
    public static final int[] G = {com.azefsw.audioconnect.R.attr.constraints, com.azefsw.audioconnect.R.attr.region_heightLessThan, com.azefsw.audioconnect.R.attr.region_heightMoreThan, com.azefsw.audioconnect.R.attr.region_widthLessThan, com.azefsw.audioconnect.R.attr.region_widthMoreThan};
    public static final /* synthetic */ g7 J = new g7();
    public static final f47 K = new f47();
    public static final g47 L = new g47();

    public static final r21 b(r21 r21Var) {
        r21 r21VarB;
        int iOrdinal = r21Var.z.ordinal();
        if (iOrdinal == 0) {
            return r21Var;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return r21Var;
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return null;
        }
        r21 r21Var2 = r21Var.A;
        if (r21Var2 == null || (r21VarB = b(r21Var2)) == null) {
            throw new IllegalStateException("no child".toString());
        }
        return r21VarB;
    }

    public static final ej1 c() {
        ej1 ej1Var = H;
        if (ej1Var != null) {
            return ej1Var;
        }
        ej1.QnHx qnHx = new ej1.QnHx("Outlined.ThumbUp");
        int i = sg5.a;
        jq4 jq4Var = new jq4(yu.b);
        le3 le3Var = new le3();
        le3Var.i(9.0f, 21.0f);
        le3Var.f(9.0f);
        le3Var.d(0.83f, 0.0f, 1.54f, -0.5f, 1.84f, -1.22f);
        le3Var.h(3.02f, -7.05f);
        le3Var.d(0.09f, -0.23f, 0.14f, -0.47f, 0.14f, -0.73f);
        le3Var.n(-2.0f);
        le3Var.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        le3Var.f(-6.31f);
        le3Var.h(0.95f, -4.57f);
        le3Var.h(0.03f, -0.32f);
        le3Var.d(0.0f, -0.41f, -0.17f, -0.79f, -0.44f, -1.06f);
        le3Var.g(14.17f, 1.0f);
        le3Var.g(7.58f, 7.59f);
        le3Var.c(7.22f, 7.95f, 7.0f, 8.45f, 7.0f, 9.0f);
        le3Var.n(10.0f);
        le3Var.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        le3Var.b();
        le3Var.i(9.0f, 9.0f);
        le3Var.h(4.34f, -4.34f);
        le3Var.g(12.0f, 10.0f);
        le3Var.f(9.0f);
        le3Var.n(2.0f);
        le3Var.h(-3.0f, 7.0f);
        le3Var.e(9.0f);
        le3Var.m(9.0f);
        le3Var.b();
        le3Var.i(1.0f, 9.0f);
        le3Var.f(4.0f);
        le3Var.n(12.0f);
        le3Var.e(1.0f);
        le3Var.b();
        qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
        ej1 ej1VarD = qnHx.d();
        H = ej1VarD;
        return ej1VarD;
    }

    public static final il2 d(zl2[] zl2VarArr, g30 g30Var) {
        g30Var.e(-312215566);
        Context context = (Context) g30Var.E(Ll.b);
        Object[] objArrCopyOf = Arrays.copyOf(zl2VarArr, zl2VarArr.length);
        kl2 kl2Var = new kl2(context);
        f34 f34Var = e34.a;
        il2 il2Var = (il2) f(objArrCopyOf, new f34(jl2.w, kl2Var), null, new ll2(context), g30Var, 4);
        for (zl2 zl2Var : zl2VarArr) {
            il2Var.v.a(zl2Var);
        }
        g30Var.G();
        return il2Var;
    }

    public static final ri2 e(Object[] objArr, f34 f34Var, h81 h81Var, g30 g30Var) {
        g30Var.e(-202053668);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        zl3 zl3Var = new zl3(f34Var);
        am3 am3Var = new am3(f34Var);
        f34 f34Var2 = e34.a;
        ri2 ri2Var = (ri2) f(objArrCopyOf, new f34(zl3Var, am3Var), null, h81Var, g30Var, 0);
        g30Var.G();
        return ri2Var;
    }

    public static final Object f(Object[] objArr, f34 f34Var, String str, h81 h81Var, g30 g30Var, int i) {
        Object objD;
        g30Var.e(441892779);
        if ((i & 2) != 0) {
            f34Var = e34.a;
        }
        Object objA = null;
        if ((i & 4) != 0) {
            str = null;
        }
        g30Var.e(1059366469);
        if (str == null || str.length() == 0) {
            int iC = g30Var.C();
            Th.c(36);
            str = Integer.toString(iC, 36);
        }
        g30Var.G();
        if (f34Var == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        }
        m24 m24Var = (m24) g30Var.E(o24.a);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        g30Var.e(-568225417);
        boolean zI = false;
        for (Object obj : objArrCopyOf) {
            zI |= g30Var.I(obj);
        }
        Object objF = g30Var.f();
        if (zI || objF == g30.QnHx.a) {
            if (m24Var != null && (objD = m24Var.d(str)) != null) {
                objA = f34Var.a(objD);
            }
            objF = objA == null ? h81Var.invoke() : objA;
            g30Var.B(objF);
        }
        g30Var.G();
        if (m24Var != null) {
            wq0.b(m24Var, str, new dm3(m24Var, str, ps0.f0(f34Var, g30Var), ps0.f0(objF, g30Var)), g30Var);
        }
        g30Var.G();
        return objF;
    }

    public static final void g(u7.QnHx qnHx, Object obj) {
        qnHx.d.add(new ad(new e7(obj, null)));
    }

    public static final mv2 h(vf3 vf3Var, h81 h81Var) {
        int iOrdinal = vf3Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 7) {
            return (mv2) h81Var.invoke();
        }
        switch (vf3Var.ordinal()) {
            case 0:
            case 7:
                return mv2.UNKNOWN;
            case 1:
                return mv2.WINDOWS;
            case 2:
                return mv2.LINUX;
            case 3:
                return mv2.MAC_OS;
            case 4:
                return mv2.IOS;
            case 5:
                return mv2.ANDROID;
            case 6:
                return mv2.ANDROID_TV;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final vf3 i(mv2 mv2Var) {
        switch (mv2Var) {
            case UNKNOWN:
                return vf3.UNKNOWN;
            case WINDOWS:
                return vf3.WINDOWS;
            case LINUX:
                return vf3.LINUX;
            case MAC_OS:
                return vf3.MAC_OS;
            case IOS:
                return vf3.IOS;
            case ANDROID:
                return vf3.ANDROID;
            case ANDROID_TV:
                return vf3.ANDROID_TV;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void j(r21 r21Var) {
        z21.a(r21Var);
        ui2<r21> ui2Var = r21Var.y;
        int i = ui2Var.y;
        if (i > 0) {
            r21[] r21VarArr = ui2Var.w;
            int i2 = 0;
            do {
                j(r21VarArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    public static hs6 k(zzgix zzgixVar) {
        if (zzgixVar.zze() == 3) {
            return new fs6(16);
        }
        if (zzgixVar.zze() == 4) {
            return new fs6(32);
        }
        if (zzgixVar.zze() == 5) {
            return new gs6();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static /* bridge */ /* synthetic */ void l(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzgoz {
        if (!p(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !p(b3) && !p(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw zzgoz.b();
    }

    public static void m(zzaqb zzaqbVar) throws GeneralSecurityException {
        Method methodZzj;
        if (I != null) {
            return;
        }
        String str = (String) zzay.zzc().zzb(zzbiy.zzct);
        if (str == null || str.length() == 0) {
            str = null;
            if (zzaqbVar != null && (methodZzj = zzaqbVar.zzj("O/RWom2ttXKsxcIeQt9LD0kGEjz6kElPF5Gfn2k8dvND1rDfknl9Z31RPOB5g0G+", "GPnS+VgCUEsE+Z+TtHFvZYB0s31DHdUZ2eNJil33wtg=")) != null) {
                str = (String) methodZzj.invoke(null, new Object[0]);
            }
            if (str == null) {
                return;
            }
        }
        try {
            zzgam zzgamVarZza = zzgar.zza(zzanm.zzb(str, true));
            for (zzgjo zzgjoVar : zzgdl.zza.zzd()) {
                if (zzgjoVar.zzf().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                }
                if (zzgjoVar.zze().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
                if (zzgjoVar.zzd().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
                if (!zzgjoVar.zzd().equals("TinkAead") && !zzgjoVar.zzd().equals("TinkMac") && !zzgjoVar.zzd().equals("TinkHybridDecrypt") && !zzgjoVar.zzd().equals("TinkHybridEncrypt") && !zzgjoVar.zzd().equals("TinkPublicKeySign") && !zzgjoVar.zzd().equals("TinkPublicKeyVerify") && !zzgjoVar.zzd().equals("TinkStreamingAead") && !zzgjoVar.zzd().equals("TinkDeterministicAead")) {
                    zzfzv zzfzvVarZza = zzgbe.zza(zzgjoVar.zzd());
                    zzgbe.zzo(zzfzvVarZza.zza());
                    zzgjoVar.zzf();
                    zzgjoVar.zze();
                    zzgjoVar.zza();
                    zzgbe.zzm(zzfzvVarZza.zzb(), zzgjoVar.zzg());
                }
            }
            I = zzgdo.zza(zzgamVarZza);
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0016  */
    /* JADX WARN: Code duplicated, block: B:12:0x0018 A[PHI: r2
  0x0018: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0012, B:11:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    public static /* bridge */ /* synthetic */ void n(byte b, byte b2, byte b3, char[] cArr, int i) throws zzgoz {
        if (!p(b2)) {
            if (b != -32) {
                if (b != -19) {
                    if (!p(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!p(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                }
            } else if (b2 >= -96) {
                b = -32;
                if (b != -19) {
                    if (!p(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!p(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                }
            }
        }
        throw zzgoz.b();
    }

    public static sd6 o(zzgix zzgixVar) {
        if (zzgixVar.zzg() == 3) {
            return new sd6(new w56(1), 13);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static boolean p(byte b) {
        return b > -65;
    }

    @Override // defpackage.vt0
    public ut0 a() {
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        firebaseCrashlytics.setCrashlyticsCollectionEnabled(true);
        return new xb0(firebaseCrashlytics);
    }

    @Override // defpackage.ba
    public Object apply(Object obj, Object obj2) {
        g83 g83Var = (g83) obj2;
        String strI = C0239D.I(g83Var.a);
        gq0.QnHx qnHx = gq0.x;
        return new uy2(strI, new gq0(ps0.p0(g83Var.a, kq0.MILLISECONDS)));
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Long.valueOf(b67.x.zza().zza());
    }
}
