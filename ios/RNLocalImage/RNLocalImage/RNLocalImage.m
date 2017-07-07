//
//  RNLocalImage.m
//  RNLocalImage
//
//  Created by Dowin on 2017/7/7.
//  Copyright © 2017年 Dowin. All rights reserved.
//

#import "RNLocalImage.h"
#import "RNOrgImageView.h"

@implementation RNLocalImage

RCT_EXPORT_MODULE()

RCT_EXPORT_VIEW_PROPERTY(path, NSString);

- (UIView *)view{
    RNOrgImageView *imgView = [[RNOrgImageView alloc]init];
    return imgView;
}

@end
