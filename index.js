import React, {Component, PropTypes} from 'react';
import {View, requireNativeComponent,NativeModules} from 'react-native';

export default class RNLocalImage extends Component {

    render() {
        return (
            <RNLocalImageApi
                {...this.props}
            />);
    }
}
RNLocalImage.propTypes = {
    ...View.propTypes,
    path:PropTypes.string,

};
const RNLocalImageApi = requireNativeComponent('RNLocalImage', RNLocalImage);
